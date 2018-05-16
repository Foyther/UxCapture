package ru.kpfu.itis.uxcapture.services.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

/**
 * Created by Nurislam on 16.05.2018.
 */
public class CriterionShortResult {
    private Long id;

    private String name;

    @JsonProperty(value = "max_value")
    private int maxValue;

    @JsonProperty(value = "min_value")
    private int minValue;

    public CriterionShortResult() {
    }

    public CriterionShortResult(Long id, String name, int maxValue, int minValue) {
        this.id = id;
        this.name = name;
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }
}
