package com.spring.Hibernate3;

import com.spring.Hibernate3.EmbeddedAndPersistence.Entity.Addresss;
import com.spring.Hibernate3.EmbeddedAndPersistence.Entity.Author;
import com.spring.Hibernate3.EmbeddedAndPersistence.Repository.EmbeddedAuthorRepository;
import com.spring.Hibernate3.EmbeddedAndPersistence.Entity.Subject;
import com.spring.Hibernate3.ManyToManyMapping.Entity.Address;
import com.spring.Hibernate3.ManyToManyMapping.Entity.AuthorManyToMany;
import com.spring.Hibernate3.ManyToManyMapping.Repository.AuthorManyToManyRepository;
import com.spring.Hibernate3.ManyToManyMapping.Entity.BookManyToMany;
import com.spring.Hibernate3.OneToManyMapping.BiDirectional.Entity.AddressOneToManyBiDirectional;
import com.spring.Hibernate3.OneToManyMapping.BiDirectional.Entity.AuthorOneToManyBiDirectional;
import com.spring.Hibernate3.OneToManyMapping.BiDirectional.Repository.AuthorOneToManyBiDirectionalRepository;
import com.spring.Hibernate3.OneToManyMapping.BiDirectional.Entity.BookOneToManyBiDirectional;
import com.spring.Hibernate3.OneToManyMapping.UniDirectional.Entity.AddressOneToManyUniDirectional;
import com.spring.Hibernate3.OneToManyMapping.UniDirectional.Repository.AuthorOneToManyRepositoryUniDirectional;
import com.spring.Hibernate3.OneToManyMapping.UniDirectional.Entity.AuthorOneToManyUniDirectional;
import com.spring.Hibernate3.OneToManyMapping.UniDirectional.Entity.BookOneToManyUniDirectional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Hibernate3ApplicationTests {

  @Autowired
  EmbeddedAuthorRepository embeddedAuthorRepository;
  @Autowired
  private AuthorManyToManyRepository authorRepository;
  @Autowired
  private AuthorOneToManyRepositoryUniDirectional authorOneToManyRepositoryUniDirectional;
  @Autowired
  private AuthorOneToManyBiDirectionalRepository authorOneToManyBiDirectionalRepository;

  @Test
  void contextLoads() {
  }

  /*** Testing method for Question no. 4 ***/
  @Test
  void testPersistence() {
    Author author = new Author();

    author.setAuthorId(1);
    author.setName("Mohit Ramtari");
    author.setGender("Male");
    author.setEmail("ramtarimohit2@gmail.com");

    Addresss authorAddress = new Addresss();
    authorAddress.setStreetNumber(78);
    authorAddress.setStreet("Janakpuri");
    authorAddress.setLocation("Gwalior");
    author.setAddress(authorAddress);

    author.getSubjectList().add(new Subject("Maths"));
    author.getSubjectList().add(new Subject("Physics"));
    author.getSubjectList().add(new Subject("Chemistry"));
    embeddedAuthorRepository.save(author);
  }

  /*** Testing method for Question no. 8 ***/
  @Test
  void testManyToManyMapping() {
    AuthorManyToMany author = new AuthorManyToMany();
    author.setAuthorId(1L);
    author.setAuthor_name("Mohit Ramtari");
    author.setAuthor_gender("Male");
    author.setAuthor_email("mohit.ramtari@tothenew.com");

    Address authorAddress = new Address();
    authorAddress.setStreetNumber(78);
    authorAddress.setStreet("Janakpuri");
    authorAddress.setLocation("Gwalior");

    author.setAuthor_address(authorAddress);

    BookManyToMany book1 = new BookManyToMany();
    book1.setBook_id(1L);
    book1.setBook_name("Maths");

    BookManyToMany book2 = new BookManyToMany();
    book2.setBook_id(2L);
    book2.setBook_name("Science");

    author.getBooks().add(book1);
    author.getBooks().add(book2);

    book1.getAuthors().add(author);
    book2.getAuthors().add(author);

    authorRepository.save(author);
  }

  /*** Testing method for Question no. 7 UniDirectional package ***/
  @Test
  void testOneToManyUniDirectional() {
    AuthorOneToManyUniDirectional author = new AuthorOneToManyUniDirectional();
    author.setName("Mohit Ramtari");
    author.setEmail("mohit.ramtari@tothenew.com");
    author.setGender("Male");
    author.setAuthorId(1L);

    AddressOneToManyUniDirectional address = new AddressOneToManyUniDirectional();
    address.setStreetNumber(78);
    address.setLocation("Gwalior");
    address.setStreet("Janakpuri");

    author.setAddress(address);

    BookOneToManyUniDirectional book1 = new BookOneToManyUniDirectional();
    book1.setBookId(1L);
    book1.setBookName("Maths");

    BookOneToManyUniDirectional book2 = new BookOneToManyUniDirectional();
    book2.setBookId(2L);
    book2.setBookName("Science");

    author.getBooks().add(book1);
    author.getBooks().add(book2);

    authorOneToManyRepositoryUniDirectional.save(author);
  }

  /*** Testing method for Question no. 7 BiDirectional package ***/
  @Test
  void testOneToManyBiDirectional() {
    AuthorOneToManyBiDirectional author = new AuthorOneToManyBiDirectional();
    author.setName("Mohit Ramtari");
    author.setEmail("ramtarimohit2@gmail.com");
    author.setGender("Male");
    author.setAuthorId(1L);

    AddressOneToManyBiDirectional authorAddress = new AddressOneToManyBiDirectional();
    authorAddress.setStreetNumber(78);
    authorAddress.setStreet("Janakpuri");
    authorAddress.setLocation("Gwalior");

    author.setAddress(authorAddress);

    BookOneToManyBiDirectional book1 = new BookOneToManyBiDirectional();
    BookOneToManyBiDirectional book2 = new BookOneToManyBiDirectional();

    book1.setBookId(1L);
    book1.setBookName("Maths");
    book1.setAuthor(author);

    book2.setBookId(2L);
    book2.setBookName("Science");
    book2.setAuthor(author);

    author.getBooks().add(book1);
    author.getBooks().add(book2);

    authorOneToManyBiDirectionalRepository.save(author);
  }
}
