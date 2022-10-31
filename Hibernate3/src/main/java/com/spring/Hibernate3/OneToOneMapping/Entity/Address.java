package com.spring.Hibernate3.OneToOneMapping.Entity;
import javax.persistence.Embeddable;

/** Created an Address class and made it Embeddable using the annotation ***/
@Embeddable
public class Address {

  /** Some required fields in Address class **/
  private Integer streetNumber;
  private String location;
  private String street;

  /*** constructor here ***/
  public Address() {

  }

  /** getter and setter methods below ***/

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
