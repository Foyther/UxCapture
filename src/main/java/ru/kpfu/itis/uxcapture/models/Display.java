package ru.kpfu.itis.uxcapture.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Nurislam on 27.03.2018.
 */
@Entity
@Table(name = "displays")
public class Display extends AbstractEntity {

    @Column(unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "app_id")
    private Application application;

    @OneToMany(mappedBy = "display", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Review> reviews;

    @OneToMany(mappedBy = "display", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TimeUse> timeUses;

    @OneToMany(mappedBy = "display", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TouchMap> touchMaps;

    public Display() {
    }

    public Display(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<TimeUse> getTimeUses() {
        return timeUses;
    }

    public void setTimeUses(List<TimeUse> timeUses) {
        this.timeUses = timeUses;
    }

    public List<TouchMap> getTouchMaps() {
        return touchMaps;
    }

    public void setTouchMaps(List<TouchMap> touchMaps) {
        this.touchMaps = touchMaps;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }
}
