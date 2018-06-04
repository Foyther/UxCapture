package ru.kpfu.itis.uxcapture.forms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nurislam on 03.06.2018.
 */
public class TimeForm {

    @JsonProperty(value = "app_id")
    private Long appId;

    @JsonProperty(value = "display_name")
    private String displayName;

    @JsonProperty(value = "device_id")
    private Long id;

    @JsonProperty(value = "time_seconds")
    private int time;

    public TimeForm() {
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
