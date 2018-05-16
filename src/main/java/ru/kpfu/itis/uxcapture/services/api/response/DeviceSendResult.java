package ru.kpfu.itis.uxcapture.services.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nurislam on 16.05.2018.
 */
public class DeviceSendResult {

    public int code;

    @JsonProperty(value = "device_id")
    private Long deviceId;

    public DeviceSendResult() {
    }

    public DeviceSendResult(int code) {
        this.code = code;
    }

    public DeviceSendResult(int code, Long deviceId) {
        this.code = code;
        this.deviceId = deviceId;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }
}
