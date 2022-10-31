package com.spring.Hibernate3.EmbeddedAndPersistence.Entity;

/*** Created a Subject class to be used while making a list of Subject in Author class ***/
public class Subject {

  private String subjectName;

  public Subject() {

  }

  public Subject(String subjectName) {
    this.subjectName = subjectName;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }
}
