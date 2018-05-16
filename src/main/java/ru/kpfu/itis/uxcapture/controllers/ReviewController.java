package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.uxcapture.forms.CategorieForm;
import ru.kpfu.itis.uxcapture.services.api.response.CriterionShortResult;
import ru.kpfu.itis.uxcapture.services.api.response.ListCriterionShortResult;
import ru.kpfu.itis.uxcapture.forms.ReviewForm;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.services.builder.ReviewBuilder;
import ru.kpfu.itis.uxcapture.services.api.response.ApiResult;
import ru.kpfu.itis.uxcapture.services.converter.CriterionToCriterionShortForm;
import ru.kpfu.itis.uxcapture.services.interf.ApplicationService;
import ru.kpfu.itis.uxcapture.services.interf.ReviewService;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Controller
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @Autowired
    ApplicationService applicationService;

    @Autowired
    ReviewBuilder builder;

    @Autowired
    CriterionToCriterionShortForm criterionToCriterionShortForm;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ApiResult review(@RequestBody ReviewForm reviewForm) {
        ApiResult apiResult = new ApiResult(0);
        try {
            reviewService.save(builder.reviewForm(reviewForm));
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }

    @RequestMapping(value = "/criterions", method = RequestMethod.POST)
    public ListCriterionShortResult criterions(@RequestBody CategorieForm categorieForm) {
        ListCriterionShortResult apiResult = new ListCriterionShortResult();
        Application application;
        try {

            if(categorieForm.getId() != null){
                application = applicationService.getById(categorieForm.getId());
                apiResult.setCriterions(getCriterions(application.getCriterions()));
            } else throw new Exception();
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }

    private List<CriterionShortResult> getCriterions(List<Criterion> criterionList) throws Exception {
        List<CriterionShortResult> criterions = new LinkedList<>();
        for (Criterion criterion:criterionList) {
            criterions.add(criterionToCriterionShortForm
                    .getCriterionShortForm(criterion));
        }
        return criterions;
    }

}
