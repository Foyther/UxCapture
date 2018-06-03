package ru.kpfu.itis.uxcapture.services.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.forms.TimeForm;
import ru.kpfu.itis.uxcapture.models.Display;
import ru.kpfu.itis.uxcapture.models.TimeUse;
import ru.kpfu.itis.uxcapture.services.impl.DisplayServiceImpl;
import ru.kpfu.itis.uxcapture.services.interf.DeviceService;
import ru.kpfu.itis.uxcapture.services.interf.DisplayService;

/**
 * Created by Nurislam on 03.06.2018.
 */
@Service
public class TimeBuilder {
    @Autowired
    private DisplayService displayService;

    @Autowired
    private DeviceService deviceService;

    public TimeUse getTimeUse(TimeForm timeForm){
        TimeUse timeUse = new TimeUse();
        timeUse.setDisplay(displayService.findByName(timeForm.getDisplayName()));
        timeUse.setDevice(deviceService.findById(timeForm.getId()));
        timeUse.setTimeSeconds(timeForm.getTime());
        return timeUse;
    }
}
