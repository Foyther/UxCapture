package ru.kpfu.itis.uxcapture.services.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.forms.TouchMapForm;
import ru.kpfu.itis.uxcapture.forms.TouchMapListForm;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.models.Display;
import ru.kpfu.itis.uxcapture.models.TouchMap;
import ru.kpfu.itis.uxcapture.services.interf.ApplicationService;
import ru.kpfu.itis.uxcapture.services.interf.DeviceService;
import ru.kpfu.itis.uxcapture.services.interf.DisplayService;

/**
 * Created by Nurislam on 16.05.2018.
 */
@Service
public class TouchMapBuilder {
    @Autowired
    private DeviceService deviceService;

    @Autowired
    private DisplayService displayService;

    @Autowired
    private ApplicationService applicationService;

    public TouchMap getTouchMap(TouchMapForm touchMapListForm, Long deviceId, Long appId) throws Exception {
        TouchMap map = new TouchMap();
        map.setDevice(deviceService.findById(deviceId));
        map.setX(touchMapListForm.getX());
        map.setY(touchMapListForm.getY());
        Display display = displayService.findByName(touchMapListForm.getDisplay());
        if(display == null){
            display = new Display();
            display.setApplication(applicationService.getById(appId));
            display.setName(touchMapListForm.getDisplay());
            displayService.save(display);
        }
        map.setDisplay(display);
        return map;
    }
}
