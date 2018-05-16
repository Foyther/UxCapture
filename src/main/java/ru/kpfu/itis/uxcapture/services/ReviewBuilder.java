package ru.kpfu.itis.uxcapture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.forms.CriterionForm;
import ru.kpfu.itis.uxcapture.forms.ReviewForm;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.models.CriterionReview;
import ru.kpfu.itis.uxcapture.models.Display;
import ru.kpfu.itis.uxcapture.models.Review;
import ru.kpfu.itis.uxcapture.repositories.DeviceRepository;
import ru.kpfu.itis.uxcapture.repositories.DisplayRepository;
import ru.kpfu.itis.uxcapture.services.interf.CriterionService;
import ru.kpfu.itis.uxcapture.services.interf.DeviceService;
import ru.kpfu.itis.uxcapture.services.interf.DisplayService;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nurislam on 24.04.2018.
 */
@Service
public class ReviewBuilder {

    @Autowired
    DisplayService displayService;

    @Autowired
    DeviceService deviceService;

    @Autowired
    CriterionService criterionService;

    public Review reviewForm(ReviewForm reviewForm) {
        Review review = new Review();

        review.setDate(new Date().getTime());
        review.setDisplay(displayService.findByName(reviewForm.getDisplayName()));
        review.setDevice(deviceService.findById(reviewForm.getId()));
        review.setText(reviewForm.getReview());
        LinkedList<CriterionReview> criterionReviewLinkedList = new LinkedList<>();
        for(CriterionForm criterionForm: reviewForm.getCriterionForms()){
            Criterion criterion = criterionService.findById(criterionForm.getId());
            CriterionReview criterionReview = new CriterionReview();
            criterionReview.setValue(criterionForm.getValue());
            criterionReview.setCriterion(criterion);
            criterionReviewLinkedList.add(criterionReview);
        }
        review.setCriterionReviews(criterionReviewLinkedList);
        return review;
    }
}
