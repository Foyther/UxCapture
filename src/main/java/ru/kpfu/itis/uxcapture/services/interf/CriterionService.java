package ru.kpfu.itis.uxcapture.services.interf;

import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.models.Device;

/**
 * Created by Nurislam on 24.04.2018.
 */
public interface CriterionService {
    void save(Criterion criterion);
    Criterion findById(Long id);
}
