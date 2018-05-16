package ru.kpfu.itis.uxcapture.services.api.response;

import java.util.List;

/**
 * Created by Nurislam on 16.05.2018.
 */
public class ListCriterionShortResult {
    private int code;
    private List<CriterionShortResult> criterions;

    public ListCriterionShortResult() {
    }

    public ListCriterionShortResult(int code, List<CriterionShortResult> criterions) {
        this.code = code;
        this.criterions = criterions;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<CriterionShortResult> getCriterions() {
        return criterions;
    }

    public void setCriterions(List<CriterionShortResult> criterions) {
        this.criterions = criterions;
    }
}
