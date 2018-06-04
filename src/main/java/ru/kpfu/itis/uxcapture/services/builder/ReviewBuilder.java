package ru.kpfu.itis.uxcapture.services.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.uxcapture.forms.CriterionForm;
import ru.kpfu.itis.uxcapture.forms.ReviewForm;
import ru.kpfu.itis.uxcapture.models.*;
import ru.kpfu.itis.uxcapture.repositories.DeviceRepository;
import ru.kpfu.itis.uxcapture.repositories.DisplayRepository;
import ru.kpfu.itis.uxcapture.services.interf.ApplicationService;
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
    private ApplicationService applicationService;

    @Autowired
    private DisplayService displayService;

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private CriterionService criterionService;

    public Review reviewForm(ReviewForm reviewForm) throws Exception {
        Review review = new Review();
        review.setDate(new Date().getTime());
        Display display = displayService.findByName(reviewForm.getDisplayName());
        if(display != null){
            review.setDisplay(display);
        } else {
            display = new Display();
            display.setApplication(applicationService.getById(reviewForm.getAppId()));
            display.setName(reviewForm.getDisplayName());
            displayService.save(display);
        }
        review.setDisplay(display);
        review.setDevice(deviceService.findById(reviewForm.getId()));
        review.setText(reviewForm.getReview());
        List<CriterionReview> criterionReviewLinkedList = new LinkedList<>();

        for(CriterionForm criterionForm: reviewForm.getCriterions()){
            Criterion criterion = criterionService.findById(criterionForm.getId());
            CriterionReview criterionReview = new CriterionReview();
            criterionReview.setValue(criterionForm.getValue());
            criterionReview.setCriterion(criterion);
            criterionReview.setReview(review);
            criterionReviewLinkedList.add(criterionReview);
        }
        review.setCriterionReviews(criterionReviewLinkedList);
        return review;
    }
}
