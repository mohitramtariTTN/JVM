package com.spring.Hibernate3.OneToOneMapping.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.spring.Hibernate3.OneToOneMapping.Entity.AuthorOneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_one_to_one")
public class BookOneToOne {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer bookId;

  @Column(name = "book_name")
  private String bookName;

  /*** Provided the details for OneToOne mapping here ***/
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "author_id")
  @JsonBackReference
  private AuthorOneToOne author;

  /*** Constructor, getters and setters here ***/
  public BookOneToOne() {

  }

  public AuthorOneToOne getAuthor() {
    return author;
  }

  public void setAuthor(AuthorOneToOne author) {
    this.author = author;
  }

  public Integer getBookId() {
    return bookId;
  }

  public void setBookId(Integer bookId) {
    this.bookId = bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }
}
