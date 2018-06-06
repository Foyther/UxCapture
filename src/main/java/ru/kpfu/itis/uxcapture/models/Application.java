package ru.kpfu.itis.uxcapture.models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by apple on 28.03.2018.
 */
@Entity
@Table(name = "apps")
public class Application extends AbstractEntity {

    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinTable(name = "apps_criterions",
            joinColumns = @JoinColumn(name = "app_id"),
            inverseJoinColumns = @JoinColumn(name = "criterion_id"))
    private List<Criterion> criterions;

    @OneToMany(mappedBy = "application", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<Display> displays;

    public Application(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Criterion> getCriterions() {
        return criterions;
    }

    public void setCriterions(List<Criterion> criterions) {
        this.criterions = criterions;
    }

    public List<Display> getDisplays() {
        return displays;
    }

    public void setDisplays(List<Display> displays) {
        this.displays = displays;
    }
}
