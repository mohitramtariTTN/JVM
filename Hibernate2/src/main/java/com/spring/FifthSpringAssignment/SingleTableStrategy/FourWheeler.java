package com.spring.FifthSpringAssignment.SingleTableStrategy;

import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Car")

public class FourWheeler extends Vehicle{
    @Column(name = "steering_type")
    private String steeringFourWheeler;

    public String getSteeringFourWheeler() {
        return steeringFourWheeler;
    }

    public void setSteeringFourWheeler(String steeringFourWheeler) {
        this.steeringFourWheeler = steeringFourWheeler;
    }
}
