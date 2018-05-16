package ru.kpfu.itis.uxcapture.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.models.CriterionReview;
import ru.kpfu.itis.uxcapture.models.Device;
import ru.kpfu.itis.uxcapture.repositories.CriterionRepository;
import ru.kpfu.itis.uxcapture.services.interf.CriterionService;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Service
public class CriterionServiceImpl implements CriterionService {
    @Autowired
    CriterionRepository criterionRepository;

    @Override
    public void save(Criterion criterion) {

    }

    @Override
    public Criterion findById(Long id) {
        return criterionRepository.findOne(id);
    }

}
