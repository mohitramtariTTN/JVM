package com.spring.Hibernate3.OneToManyMapping.UniDirectional.Entity;

import javax.persistence.*;

/*** Created an entity for Book here and provided its table name ***/
@Entity
@Table(name = "book_one_to_many_unidirectional")
public class BookOneToManyUniDirectional {
    /*** Created some fields and provided their column names **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    /*** Constructor here **/
    public BookOneToManyUniDirectional(){

    }

    /*** getters and setters here ***/
    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
