package ru.kpfu.itis.uxcapture.services.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.forms.TouchMapForm;
import ru.kpfu.itis.uxcapture.forms.TouchMapListForm;
import ru.kpfu.itis.uxcapture.models.TouchMap;
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

    public TouchMap getTouchMap(TouchMapForm touchMapListForm, Long deviceId){
        TouchMap map = new TouchMap();
        map.setDevice(deviceService.findById(deviceId));
        map.setX(touchMapListForm.getX());
        map.setY(touchMapListForm.getY());
        map.setDisplay(displayService.findByName(touchMapListForm.getDisplay()));
        return map;
    }
}
