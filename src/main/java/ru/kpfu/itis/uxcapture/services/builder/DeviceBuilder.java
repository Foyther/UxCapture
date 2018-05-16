package ru.kpfu.itis.uxcapture.services.builder;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.forms.DeviceInfoForm;
import ru.kpfu.itis.uxcapture.models.Device;

/**
 * Created by Nurislam on 16.05.2018.
 */
@Service
public class DeviceBuilder {

    public Device getDevice(DeviceInfoForm deviceInfoForm){
        Device device = new Device();
        device.setUuid(deviceInfoForm.getUuid());
        device.setOS(deviceInfoForm.getOs());
        device.setScreenHeight(deviceInfoForm.getHeight());
        device.setScreenWidth(deviceInfoForm.getWidth());
        device.setDpi(deviceInfoForm.getDpi());
        return device;
    }

}
