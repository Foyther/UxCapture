package ru.kpfu.itis.uxcapture.services.interf;

import ru.kpfu.itis.uxcapture.models.Device;
import ru.kpfu.itis.uxcapture.models.Display;

/**
 * Created by Nurislam on 24.04.2018.
 */
public interface DisplayService {
    void save(Display display);
    Display findByName(String name);
}
