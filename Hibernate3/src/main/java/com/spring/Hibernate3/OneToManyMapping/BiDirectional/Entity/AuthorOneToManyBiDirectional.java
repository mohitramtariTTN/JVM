package com.spring.Hibernate3.OneToManyMapping.BiDirectional.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/*** Created an Entity for Author here and provided its table name ***/
@Entity
@Table(name = "author_one_to_many_bidirectional")
public class AuthorOneToManyBiDirectional {
    /*** Created some fields for Author entity and provided their column names respectively **/
    @Id
    @Column(name = "author_id")
    private Long authorId;

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
    AddressOneToManyBiDirectional address;

    /*** Provided details for OnetToMapping here ***/
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookOneToManyBiDirectional> books = new ArrayList<BookOneToManyBiDirectional>();

    /** Method to add the book in the list and set its author ***/
    public void addBook(BookOneToManyBiDirectional book){
        books.add(book);
        book.setAuthor(this);
    }

    /*** Method to remove the book from the list and set the author to null **/
    public void removeBook(BookOneToManyBiDirectional book){
        books.remove(book);
        book.setAuthor(null);
    }

    /*** getters and setters below **/

    public List<BookOneToManyBiDirectional> getBooks() {
        return books;
    }

    public void setBooks(List<BookOneToManyBiDirectional> books) {
        this.books = books;
    }

    public AuthorOneToManyBiDirectional(){

    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
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

    public AddressOneToManyBiDirectional getAddress() {
        return address;
    }

    public void setAddress(AddressOneToManyBiDirectional address) {
        this.address = address;
    }
}
