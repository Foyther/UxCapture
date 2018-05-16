package ru.kpfu.itis.uxcapture.forms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nurislam on 16.05.2018.
 */
public class DeviceInfoForm {

    @JsonProperty(value = "app_id")
    private Long appId;
    private String uuid;
    private String os;
    private int width;
    private int height;
    private int dpi;

    public DeviceInfoForm() {
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }
}
