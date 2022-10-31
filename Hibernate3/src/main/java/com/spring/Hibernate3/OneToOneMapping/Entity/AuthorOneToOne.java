package com.spring.Hibernate3.OneToOneMapping.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*** Created an Entity of Author here and passed its table name by using @Table annotation ***/
@Entity
@Table(name = "author_one_to_one")
public class AuthorOneToOne {
  /*** Some required fields of Author class and their column names ***/
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer authorId;

  @Column(name = "author_name")
  private String name;

  @Column(name = "author_email")
  private String email;

  @Column(name = "author_gender")
  private String gender;

  @Embedded
  @AttributeOverrides({
      @AttributeOverride(name = "streetNumber", column = @Column(name = "author_street_number")),
      @AttributeOverride(name = "location", column = @Column(name = "author_location")),
      @AttributeOverride(name = "street", column = @Column(name = "author_street"))
  })
  private Address address;

  /*** Provided the OneToOne mapping here ***/
  /*** It is being mapped by the author in the BookOneToOne class ***/
  @OneToOne(cascade = CascadeType.ALL, mappedBy = "author")
  @JsonManagedReference
  private BookOneToOne book;

  /*** Constructor, getters and setters below ***/
  public AuthorOneToOne() {

  }

  public BookOneToOne getBook() {
    return book;
  }

  public void setBook(BookOneToOne book) {
    this.book = book;
  }

  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

}
