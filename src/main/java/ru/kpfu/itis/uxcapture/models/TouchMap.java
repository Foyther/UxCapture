package ru.kpfu.itis.uxcapture.models;

import javax.persistence.*;

/**
 * Created by Nurislam on 27.03.2018.
 */
@Entity
@Table(name = "touch_maps")
public class TouchMap extends AbstractEntity {

    private double x;

    private double y;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "display_id")
    private Display display;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    public TouchMap() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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
