package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.uxcapture.forms.CreateCriterionForm;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.repositories.CriterionRepository;
import ru.kpfu.itis.uxcapture.services.api.response.ApiResult;

/**
 * Created by apple on 06.06.2018.
 */
@RestController
@RequestMapping("/criterions")
public class CriterionController {

    @Autowired
    private CriterionRepository criterionRepository;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ApiResult createCriterion(@RequestBody CreateCriterionForm createCriterionForm) {
        ApiResult apiResult = new ApiResult(0);
        try {
            Criterion criterion = new Criterion();

            criterion.setName(createCriterionForm.getName());
            criterion.setMinValue(createCriterionForm.getMinvalue());
            criterion.setMaxValue(createCriterionForm.getMaxvalue());

            criterion = criterionRepository.save(criterion);

            apiResult.setBody(criterion);
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }
}
