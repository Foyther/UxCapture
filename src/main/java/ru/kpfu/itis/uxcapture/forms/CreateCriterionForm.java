package ru.kpfu.itis.uxcapture.forms;

import java.util.List;

/**
 * Created by apple on 06.06.2018.
 */
public class CreateCriterionForm {
    private int minvalue;
    private int maxvalue;
    private String name;


    public int getMinvalue() {
        return minvalue;
    }

    public void setMinvalue(int minvalue) {
        this.minvalue = minvalue;
    }

    public int getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(int maxvalue) {
        this.maxvalue = maxvalue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
