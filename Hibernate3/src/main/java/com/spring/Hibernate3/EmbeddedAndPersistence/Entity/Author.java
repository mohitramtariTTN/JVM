package com.spring.Hibernate3.EmbeddedAndPersistence.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "authors")
public class Author implements Serializable {

  /*** Solution 3 : Created a List of Subject here **/
  @ElementCollection(fetch = FetchType.LAZY)
  @AttributeOverrides({
      @AttributeOverride(name = "subjectName", column = @Column(name = "subjectList"))
  })
  @Size(min = 3)
  List<Subject> subjectList = new ArrayList<Subject>();

  /*** Some required fields of the Author class and their column names ***/
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer authorId;

  @Column(name = "author_name")
  private String name;

  @Column(name = "author_email")
  private String email;

  @Column(name = "author_gender")
  private String gender;

  /*** Made an Embedded object of Address class and provided column names for its fields ***/
  @Embedded
  @AttributeOverrides({
      @AttributeOverride(name = "streetNumber", column = @Column(name = "author_street_number")),
      @AttributeOverride(name = "location", column = @Column(name = "author_location")),
      @AttributeOverride(name = "street", column = @Column(name = "author_street"))
  })
  private Addresss address;

  /** Constructor here **/
  public Author() {

  }

  /*** getters and setters methods below **/

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

  public Addresss getAddress() {
    return address;
  }

  public void setAddress(Addresss address) {
    this.address = address;
  }

  public List<Subject> getSubjectList() {
    return subjectList;
  }

  public void setSubjectList(List<Subject> subjectList) {
    this.subjectList = subjectList;
  }
}

