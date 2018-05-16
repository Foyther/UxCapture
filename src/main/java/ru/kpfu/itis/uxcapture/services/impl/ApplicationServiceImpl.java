package ru.kpfu.itis.uxcapture.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.repositories.ApplicationRepository;
import ru.kpfu.itis.uxcapture.services.interf.ApplicationService;

/**
 * Created by Nurislam on 16.05.2018.
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    ApplicationRepository applicationRepository;

    @Override
    public Application getById(Long id) throws Exception {
        Application application = new Application();
        if(id != null){
             application = applicationRepository.findOne(id);
        } else throw new Exception();
        if(application != null){
            return application;
        }else  throw new Exception();
    }
}
