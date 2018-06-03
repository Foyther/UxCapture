package ru.kpfu.itis.uxcapture.forms;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.kpfu.itis.uxcapture.models.TouchMap;

import java.util.List;

/**
 * Created by Nurislam on 16.05.2018.
 */
public class TouchMapListForm {

    @JsonProperty(value = "app_id")
    private Long appId;

    @JsonProperty(value = "device_id")
    private Long deviceId;

    @JsonProperty(value = "touch_map")
    private List<TouchMapForm> touchMap;

    public TouchMapListForm() {
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public List<TouchMapForm> getTouchMap() {
        return touchMap;
    }

    public void setTouchMap(List<TouchMapForm> touchMap) {
        this.touchMap = touchMap;
    }
}
