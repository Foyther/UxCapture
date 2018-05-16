package ru.kpfu.itis.uxcapture.forms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Nurislam on 24.04.2018.
 */
public class CategorieForm {

    @JsonProperty(value = "app_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
