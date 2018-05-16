package ru.kpfu.itis.uxcapture.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.models.Display;
import ru.kpfu.itis.uxcapture.repositories.DisplayRepository;
import ru.kpfu.itis.uxcapture.services.interf.DisplayService;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Service
public class DisplayServiceImpl implements DisplayService{

    @Autowired
    private DisplayRepository displayRepository;

    public void save(Display display){
        if(display != null){
            displayRepository.save(display);
        }
    }

    @Override
    public Display findByName(String name) {
        return displayRepository.findByName(name);
    }
}
