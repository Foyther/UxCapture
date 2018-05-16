package ru.kpfu.itis.uxcapture.models;

import javax.persistence.*;

/**
 * Created by Nurislam on 27.03.2018.
 */
@Entity
@Table(name = "criterion_reviews")
public class CriterionReview extends AbstractEntity {

    private int value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private Review review;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "criterion_id")
    private Criterion criterion;

    public CriterionReview() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Criterion getCriterion() {
        return criterion;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }
}
