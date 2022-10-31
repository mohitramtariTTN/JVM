package com.spring.Hibernate3.OneToOneMapping.Service;

import com.spring.Hibernate3.OneToOneMapping.Repository.AuthorRepository;
import com.spring.Hibernate3.OneToOneMapping.Entity.AuthorOneToOne;
import com.spring.Hibernate3.OneToOneMapping.Entity.BookOneToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

  @Autowired
  private AuthorRepository authorRepository;

  /*** Method to save the author in the database ***/
  public AuthorOneToOne saveAuthor(AuthorOneToOne author) {
    BookOneToOne book = author.getBook();
    book.setAuthor(author);
    author = authorRepository.save(author);
    return author;
  }

  /*** Method to retrieve author by the id passed in as a parameter ***/
  public AuthorOneToOne findAuthorByAuthorId(int authorId) {
    AuthorOneToOne author = authorRepository.findAuthorByAuthorId(authorId);
    return author;
  }
}
