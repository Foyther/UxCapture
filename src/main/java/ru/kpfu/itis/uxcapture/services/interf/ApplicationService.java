package ru.kpfu.itis.uxcapture.services.interf;

import ru.kpfu.itis.uxcapture.models.Application;

/**
 * Created by Nurislam on 16.05.2018.
 */
public interface ApplicationService {

    Application getById(Long id) throws Exception;
}
