package ru.kpfu.itis.uxcapture.services.interf;

import javassist.NotFoundException;
import ru.kpfu.itis.uxcapture.forms.ReviewForm;
import ru.kpfu.itis.uxcapture.models.Review;

/**
 * Created by Nurislam on 24.04.2018.
 */
public interface ReviewService {

    void save(Review review) throws NotFoundException;
}
