package com.spring.FifthSpringAssignment.TablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class PartTimeEmployee extends Employees {
    @Column(name = "per_hour_rate")
    private Integer perHourRate;

    public PartTimeEmployee(){

    }

    public Integer getPerHourRate() {
        return perHourRate;
    }

    public void setPerHourRate(Integer perHourRate) {
        this.perHourRate = perHourRate;
    }
}
