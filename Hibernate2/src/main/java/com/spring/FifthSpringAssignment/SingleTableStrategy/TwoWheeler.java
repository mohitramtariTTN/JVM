package com.spring.FifthSpringAssignment.SingleTableStrategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle{
    @Column(name = "steering_type")
    private String steeringTwoWheeler;

    public String getSteeringTwoWheeler() {
        return steeringTwoWheeler;
    }

    public void setSteeringTwoWheeler(String steeringTwoWheeler) {
        this.steeringTwoWheeler = steeringTwoWheeler;
    }
}
