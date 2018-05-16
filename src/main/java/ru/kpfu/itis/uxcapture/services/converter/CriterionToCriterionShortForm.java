package ru.kpfu.itis.uxcapture.services.converter;

import ru.kpfu.itis.uxcapture.services.api.response.CriterionShortResult;
import ru.kpfu.itis.uxcapture.models.Criterion;

/**
 * Created by Nurislam on 16.05.2018.
 */
public interface CriterionToCriterionShortForm {
    CriterionShortResult getCriterionShortForm(Criterion criterion) throws Exception;
}
