package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.uxcapture.models.Application;
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


}
