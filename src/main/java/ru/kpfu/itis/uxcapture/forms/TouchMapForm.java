package ru.kpfu.itis.uxcapture.forms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nurislam on 16.05.2018.
 */
public class TouchMapForm {

    private int x;
    private int y;

    @JsonProperty(value = "display_name")
    private String display;

    public TouchMapForm() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
