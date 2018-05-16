package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.uxcapture.forms.DeviceInfoForm;
import ru.kpfu.itis.uxcapture.models.Device;
import ru.kpfu.itis.uxcapture.services.builder.DeviceBuilder;
import ru.kpfu.itis.uxcapture.services.api.response.DeviceSendResult;
import ru.kpfu.itis.uxcapture.services.interf.DeviceService;

/**
 * Created by Nurislam on 16.05.2018.
 */

@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @Autowired
    private DeviceBuilder deviceBuilder;

    //TODO app id isn't check
    @RequestMapping(value = "", method = RequestMethod.POST)
    public DeviceSendResult device(@RequestBody DeviceInfoForm deviceInfoForm) {
        DeviceSendResult apiResult = new DeviceSendResult(0);
        try {
            if(deviceInfoForm.getUuid() != null){
                Device device = deviceBuilder.getDevice(deviceInfoForm);
                deviceService.save(device);
                apiResult.setDeviceId(device.getId());
            } else throw new Exception();
        } catch (Exception e) {
            apiResult.setCode(1);
        }
        return apiResult;
    }
}