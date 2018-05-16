package ru.kpfu.itis.uxcapture.services.converter;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.services.api.response.CriterionShortResult;
import ru.kpfu.itis.uxcapture.models.Criterion;

/**
 * Created by Nurislam on 16.05.2018.
 */
@Service
public class CriterionToCriterionShortFormImpl implements CriterionToCriterionShortForm {

    @Override
    public CriterionShortResult getCriterionShortForm(Criterion criterion) throws Exception {
        if(criterion != null) {
            CriterionShortResult form = new CriterionShortResult(criterion.getId(),
                    criterion.getName(),
                    criterion.getMaxValue(),
                    criterion.getMinValue());
            return form;
        } else throw new Exception();
    }
}
