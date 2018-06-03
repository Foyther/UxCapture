package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.uxcapture.forms.ReviewForm;
import ru.kpfu.itis.uxcapture.forms.TimeForm;
import ru.kpfu.itis.uxcapture.models.TimeUse;
import ru.kpfu.itis.uxcapture.services.api.response.ApiResult;
import ru.kpfu.itis.uxcapture.services.builder.TimeBuilder;
import ru.kpfu.itis.uxcapture.services.interf.TimeUseService;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Nurislam on 03.06.2018.
 */
@RestController
@RequestMapping(path = "/time")
public class TimeController {
    @Autowired
    private TimeUseService timeUseService;

    @Autowired
    private TimeBuilder timeBuilder;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ApiResult review(@RequestBody TimeForm timeForm) {
        ApiResult apiResult = new ApiResult(0);
        try {
            timeUseService.save(timeBuilder.getTimeUse(timeForm));
        } catch (Exception e) {
            apiResult.setCode(1);
            Logger.getLogger(TimeController.class.getName()).log(Level.SEVERE, null, e);
        }
        return apiResult;
    }

}
