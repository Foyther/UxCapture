package ru.kpfu.itis.uxcapture.services.impl;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.models.Review;
import ru.kpfu.itis.uxcapture.repositories.ReviewRepository;
import ru.kpfu.itis.uxcapture.services.interf.ReviewService;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public void save(Review review) throws NotFoundException{
        if(review != null){
            reviewRepository.save(review);
        }
    }
}
