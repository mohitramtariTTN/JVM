package com.spring.Hibernate3.ManyToManyMapping.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/** Created an Entity for Author here and provided its table name ***/
@Entity
@Table(name = "author_many_to_many")
public class AuthorManyToMany {

    /*** Created some fields for Author Entity and provided their column names ***/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "author_name")
    private String author_name;

    @Column(name = "author_email")
    private String author_email;

    @Column(name = "author_gender")
    private String author_gender;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "streetNumber", column = @Column(name = "author_street_number")),
            @AttributeOverride(name = "location", column = @Column(name = "author_location")),
            @AttributeOverride(name = "street", column = @Column(name = "author_street"))
    })
    private Address author_address;

    /*** Provided ManyToMany mapping here ***/
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "authors_books",
            joinColumns = {
                    @JoinColumn(name = "author_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "book_id")
            }
    )
    Set<BookManyToMany> books = new HashSet<BookManyToMany>();

    /** Constructor, getters and setters here ***/
    public AuthorManyToMany(){

    }

    public AuthorManyToMany(Long authorId, String author_name, String author_email, String author_gender, Address author_address) {
        this.authorId = authorId;
        this.author_name = author_name;
        this.author_email = author_email;
        this.author_gender = author_gender;
        this.author_address = author_address;
    }

    public AuthorManyToMany(Long authorId, String author_name, String author_email, String author_gender, Address author_address, Set<BookManyToMany> books) {
        this.authorId = authorId;
        this.author_name = author_name;
        this.author_email = author_email;
        this.author_gender = author_gender;
        this.author_address = author_address;
        this.books = books;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_email() {
        return author_email;
    }

    public void setAuthor_email(String author_email) {
        this.author_email = author_email;
    }

    public String getAuthor_gender() {
        return author_gender;
    }

    public void setAuthor_gender(String author_gender) {
        this.author_gender = author_gender;
    }

    public Address getAuthor_address() {
        return author_address;
    }

    public void setAuthor_address(Address author_address) {
        this.author_address = author_address;
    }

    public Set<BookManyToMany> getBooks() {
        return books;
    }

    public void setBooks(Set<BookManyToMany> books) {
        this.books = books;
    }
}
