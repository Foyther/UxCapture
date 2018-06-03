package ru.kpfu.itis.uxcapture.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.models.TimeUse;
import ru.kpfu.itis.uxcapture.repositories.TimeUseRepository;
import ru.kpfu.itis.uxcapture.services.interf.TimeUseService;

/**
 * Created by Nurislam on 03.06.2018.
 */
@Service
public class TimeUseServiceImpl implements TimeUseService {
    @Autowired
    private TimeUseRepository timeUseRepository;

    @Override
    public void save(TimeUse timeUse){
        timeUseRepository.save(timeUse);
    }
}
