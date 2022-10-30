package com.spring.FifthSpringAssignment.SingleTableStrategy;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name="vehicle_type",
        discriminatorType = DiscriminatorType.STRING
)
public class Vehicle {
    @Id
    @Column(name = "vehicle_id")
    private Integer vehicleId;

    @Column(name = "vehicle_name")
    private String vehicleName;

    public Vehicle() {

    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
