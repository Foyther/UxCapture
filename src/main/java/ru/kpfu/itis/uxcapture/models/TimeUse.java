package ru.kpfu.itis.uxcapture.models;

import javax.persistence.*;

/**
 * Created by Nurislam on 27.03.2018.
 */
@Entity
@Table(name = "time_uses")
public class TimeUse extends AbstractEntity {

    private int timeSeconds;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "display_id")
    private Display display;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    public TimeUse() {
    }

    public int getTimeSeconds() {
        return timeSeconds;
    }

    public void setTimeSeconds(int timeSeconds) {
        this.timeSeconds = timeSeconds;
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
}
