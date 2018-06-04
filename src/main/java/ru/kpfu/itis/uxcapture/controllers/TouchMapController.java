package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.uxcapture.forms.DeviceInfoForm;
import ru.kpfu.itis.uxcapture.forms.TouchMapForm;
import ru.kpfu.itis.uxcapture.forms.TouchMapListForm;
import ru.kpfu.itis.uxcapture.models.Device;
import ru.kpfu.itis.uxcapture.models.TouchMap;
import ru.kpfu.itis.uxcapture.services.api.response.ApiResult;
import ru.kpfu.itis.uxcapture.services.api.response.DeviceSendResult;
import ru.kpfu.itis.uxcapture.services.builder.TouchMapBuilder;
import ru.kpfu.itis.uxcapture.services.interf.ApplicationService;
import ru.kpfu.itis.uxcapture.services.interf.TouchMapService;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nurislam on 16.05.2018.
 */

@RestController
@RequestMapping("/touch_map")
public class TouchMapController {
    @Autowired
    private TouchMapService touchMapService;

    @Autowired
    private TouchMapBuilder touchMapBuilder;

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ApiResult device(@RequestBody TouchMapListForm touchMapListForm) {
        ApiResult result = new ApiResult();
        try {
            if(touchMapListForm != null
                    && touchMapListForm.getAppId() != 0 &&
                    applicationService.getById(touchMapListForm.getAppId()) != null){
                touchMapService.save(getTouchMapList(touchMapListForm.getTouchMap(),
                        touchMapListForm.getDeviceId()));
            } else throw new Exception();
        } catch (Exception e) {
            result.setCode(1);
        }
        return result;
    }

    private List<TouchMap> getTouchMapList(List<TouchMapForm> touchMapForms, Long deviceId){
        List<TouchMap> touchMaps = new LinkedList<>();
        for(TouchMapForm form: touchMapForms){
            touchMaps.add(touchMapBuilder.getTouchMap(form, deviceId));
        }
        return touchMaps;
    }

}
