package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.uxcapture.forms.DeviceInfoForm;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.models.Device;
import ru.kpfu.itis.uxcapture.repositories.ApplicationRepository;
import ru.kpfu.itis.uxcapture.services.api.response.ApiResult;
import ru.kpfu.itis.uxcapture.services.api.response.DeviceSendResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by apple on 05.06.2018.
 */
@RestController
@RequestMapping("/apps")
public class ApplicationController {

    @Autowired
    private ApplicationRepository applicationRepository;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ApiResult application(@RequestParam String name) {
        ApiResult apiResult = new ApiResult(0);
        try {
            if (name != null) {
                Application application = new Application();
                application.setName(name);
                application = applicationRepository.save(application);

                apiResult.setBody(application);
            } else throw new Exception();
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public ApiResult applicationDelete(HttpServletRequest request) {
        ApiResult apiResult = new ApiResult(0);
        try {
            long id = new Long(request.getParameter("id"));
            Application application = applicationRepository.findOne(id);
            applicationRepository.delete(application);

            apiResult.setBody("success");
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }
}
