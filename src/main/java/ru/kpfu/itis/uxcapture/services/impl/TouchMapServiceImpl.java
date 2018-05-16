package ru.kpfu.itis.uxcapture.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.models.TouchMap;
import ru.kpfu.itis.uxcapture.repositories.TouchMapRepository;
import ru.kpfu.itis.uxcapture.services.interf.TouchMapService;

import java.util.List;

/**
 * Created by Nurislam on 16.05.2018.
 */
@Service
public class TouchMapServiceImpl implements TouchMapService {
    @Autowired
    private TouchMapService touchMapService;

    @Override
    public void save(List<TouchMap> touchMapList) throws Exception {
        if(touchMapList != null && touchMapList.size() > 0){
            touchMapList.addAll(touchMapList);
        } else throw new Exception();
    }
}
