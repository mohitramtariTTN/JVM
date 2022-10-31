package com.spring.Hibernate3.EmbeddedAndPersistence.Entity;

import javax.persistence.Embeddable;

/*** Craeated an Address class and made it Embeddable using annotation ***/
@Embeddable
public class Addresss {
  /*** Required fields inside the class ***/
  private Integer streetNumber;
  private String location;
  private String street;

  /*** Constructor here **/
  public Addresss() {

  }

  /*** getter and setter methods below ***/

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
