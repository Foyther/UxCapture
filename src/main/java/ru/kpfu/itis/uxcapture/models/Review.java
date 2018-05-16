package ru.kpfu.itis.uxcapture.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reviews")
public class Review extends AbstractEntity {

    private Long date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "display_id")
    private Display display;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    private String text;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CriterionReview> criterionReviews;

    public Review() {
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<CriterionReview> getCriterionReviews() {
        return criterionReviews;
    }

    public void setCriterionReviews(List<CriterionReview> criterionReviews) {
        this.criterionReviews = criterionReviews;
    }
}
