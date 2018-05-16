package ru.kpfu.itis.uxcapture.forms;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.models.CriterionReview;
import ru.kpfu.itis.uxcapture.models.Review;

import java.util.List;

/**
 * Created by Nurislam on 18.04.2018.
 */
public class ReviewForm {

    @JsonProperty(value = "app_id")
    private String appId;

    @JsonProperty(value = "device_id")
    private Long id;

    @JsonProperty(value = "display_name")
    private String displayName;

    private String review;

    private List<CriterionForm> criterionForms;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public List<CriterionForm> getCriterionForms() {
        return criterionForms;
    }

    public void setCriterionForms(List<CriterionForm> criterionForms) {
        this.criterionForms = criterionForms;
    }

    @Override
    public String toString() {
        return "ReviewForm{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", review='" + review + '\'' +
                ", criterionForms=" + criterionForms +
                '}';
    }
}

