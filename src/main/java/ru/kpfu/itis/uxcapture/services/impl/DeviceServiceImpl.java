package ru.kpfu.itis.uxcapture.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.models.Device;
import ru.kpfu.itis.uxcapture.models.Display;
import ru.kpfu.itis.uxcapture.repositories.DeviceRepository;
import ru.kpfu.itis.uxcapture.repositories.DisplayRepository;
import ru.kpfu.itis.uxcapture.services.interf.DeviceService;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Service
public class DeviceServiceImpl implements DeviceService{
    @Autowired
    private DeviceRepository deviceRepository;

    public Long save(Device device){
        if(device != null){
            if(deviceRepository.findByUuid(device.getUuid()) == null){
                deviceRepository.save(device);
            } else {
                Device refreshDevice = deviceRepository.findByUuid(device.getUuid());
                refreshDevice.setDpi(device.getDpi());
                refreshDevice.setScreenWidth(device.getScreenWidth());
                refreshDevice.setScreenHeight(device.getScreenHeight());
                refreshDevice.setOS(device.getOS());
                device = refreshDevice;
                deviceRepository.save(refreshDevice);
            }
        }
        return device.getId();
    }

    @Override
    public Device findById(Long id) {
        return deviceRepository.findOne(id);
    }

    @Override
    public Device findByUUID(String uuid) {
        return deviceRepository.findByUuid(uuid);
    }
}
