package ru.kpfu.itis.uxcapture.services.interf;

import ru.kpfu.itis.uxcapture.models.TouchMap;

import java.util.List;

/**
 * Created by Nurislam on 16.05.2018.
 */
public interface TouchMapService {

    void save(List<TouchMap> touchMapList) throws Exception;
}
