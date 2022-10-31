package com.spring.Hibernate3.OneToManyMapping.UniDirectional.Entity;
import javax.persistence.Embeddable;

/*** Created an Embeddable class for Address **/
@Embeddable
public class AddressOneToManyUniDirectional {
    /*** Provided fields for the Address class **/
    private Integer streetNumber;
    private String location;
    private String street;

    /*** Constructor, getters and setters below ***/
    public AddressOneToManyUniDirectional(){

    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
