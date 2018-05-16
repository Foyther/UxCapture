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

    public void save(Device device){
        if(device != null){
            deviceRepository.save(device);
        }
    }

    @Override
    public Device findById(Long id) {
        return deviceRepository.findOne(id);
    }
}
