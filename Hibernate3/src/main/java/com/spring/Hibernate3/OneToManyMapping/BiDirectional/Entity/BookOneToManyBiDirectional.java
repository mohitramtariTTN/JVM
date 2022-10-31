package com.spring.Hibernate3.OneToManyMapping.BiDirectional.Entity;

import com.spring.Hibernate3.OneToManyMapping.BiDirectional.Entity.AuthorOneToManyBiDirectional;
import javax.persistence.*;

/*** Created an Entity for Book and provided its table name ***/
@Entity
@Table(name = "book_one_to_many_bidirectional")
public class BookOneToManyBiDirectional {
    /*** Provided some fields for the book entity and provided their column names respectively **/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_id")
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    public AuthorOneToManyBiDirectional getAuthor() {
        return author;
    }

    public void setAuthor(AuthorOneToManyBiDirectional author) {
        this.author = author;
    }

    /*** Provided details for ManyToOne mapping **/
    @ManyToOne(fetch = FetchType.LAZY)
    private AuthorOneToManyBiDirectional author;

    /*** Constructor, getters and setters below ***/
    public BookOneToManyBiDirectional(){

    }

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
