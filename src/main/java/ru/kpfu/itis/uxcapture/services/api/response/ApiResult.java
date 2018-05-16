package ru.kpfu.itis.uxcapture.services.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * Created by Nurislam on 18.04.2018.
 */
public class ApiResult implements Serializable {

    private int code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object body;

    public ApiResult(int code, Object body) {
        this.code = code;
        this.body = body;
    }

    public ApiResult(int code) {
        this.code = code;
    }

    public ApiResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }


}
