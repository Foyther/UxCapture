package ru.kpfu.itis.uxcapture.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Nurislam on 27.03.2018.
 */
@Entity
@Table(name = "devices")
public class Device extends AbstractEntity {

    @Column(unique = true)
    private String uuid;

    private String OS;

    private int screenWidth;

    private int screenHeight;

    private int dpi;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Review> reviews;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TouchMap> touchMaps;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TimeUse> timeUses;

    public Device() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<TouchMap> getTouchMaps() {
        return touchMaps;
    }

    public void setTouchMaps(List<TouchMap> touchMaps) {
        this.touchMaps = touchMaps;
    }

    public List<TimeUse> getTimeUses() {
        return timeUses;
    }

    public void setTimeUses(List<TimeUse> timeUses) {
        this.timeUses = timeUses;
    }
}
