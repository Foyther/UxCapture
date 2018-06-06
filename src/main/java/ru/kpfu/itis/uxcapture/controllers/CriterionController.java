package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.uxcapture.forms.CreateCriterionForm;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.repositories.ApplicationRepository;
import ru.kpfu.itis.uxcapture.repositories.CriterionRepository;
import ru.kpfu.itis.uxcapture.services.api.response.ApiResult;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by apple on 06.06.2018.
 */
@RestController
@RequestMapping("/criterions")
public class CriterionController {

    @Autowired
    private CriterionRepository criterionRepository;
    @Autowired
    private ApplicationRepository applicationRepository;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ApiResult createCriterion(@RequestBody CreateCriterionForm createCriterionForm) {
        ApiResult apiResult = new ApiResult(0);
        try {
            Criterion criterion = new Criterion();

            criterion.setName(createCriterionForm.getName());
            criterion.setMinValue(createCriterionForm.getMinvalue());
            criterion.setMaxValue(createCriterionForm.getMaxvalue());

            Iterator<Integer> iterator = createCriterionForm.getApps().iterator();
            List<Application> apps = new ArrayList<>();
            while(iterator.hasNext()) {
                Application application = applicationRepository.findOne(Long.valueOf(iterator.next()));
                apps.add(application);
            }
            criterion.setApplications(apps);

            criterion = criterionRepository.save(criterion);

            apiResult.setBody(criterion);
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }

    @RequestMapping(value = "", method = RequestMethod.PATCH)
    public ApiResult editCriterion(@RequestBody CreateCriterionForm createCriterionForm) {
        ApiResult apiResult = new ApiResult(0);
        try {
            Criterion criterion = criterionRepository.getOne(createCriterionForm.getId());

            criterion.setName(createCriterionForm.getName());
            criterion.setMinValue(createCriterionForm.getMinvalue());
            criterion.setMaxValue(createCriterionForm.getMaxvalue());

            Iterator<Integer> iterator = createCriterionForm.getApps().iterator();
            List<Application> apps = new ArrayList<>();
            while(iterator.hasNext()) {
                Application application = applicationRepository.findOne(Long.valueOf(iterator.next()));
                apps.add(application);
            }
            criterion.setApplications(apps);

            criterion = criterionRepository.save(criterion);

            apiResult.setBody(criterion);
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ApiResult criterionDelete(@RequestBody CreateCriterionForm createCriterionForm) {
        ApiResult apiResult = new ApiResult(0);
        try {
            Criterion criterion = criterionRepository.findOne(createCriterionForm.getId());
            criterionRepository.delete(criterion);

            apiResult.setBody("success");
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }
}
