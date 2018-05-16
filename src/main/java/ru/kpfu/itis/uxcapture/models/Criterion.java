package ru.kpfu.itis.uxcapture.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Nurislam on 27.03.2018.
 */
@Entity
@Table(name = "criterions")
public class Criterion extends AbstractEntity {

    @Column(unique = true)
    private String name;

    private int maxValue;

    private int minValue;

    @OneToMany(mappedBy = "criterion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CriterionReview> criterionReviews;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Application> applications;

    public Criterion() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public List<CriterionReview> getCriterionReviews() {
        return criterionReviews;
    }

    public void setCriterionReviews(List<CriterionReview> criterionReviews) {
        this.criterionReviews = criterionReviews;
    }

    public List<Application> getApplications() {
        return applications;
    }

    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }
}
