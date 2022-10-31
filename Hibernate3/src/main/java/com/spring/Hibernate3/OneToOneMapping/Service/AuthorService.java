package com.spring.Hibernate3.OneToOneMapping.Service;

import com.spring.Hibernate3.OneToOneMapping.Entity.AuthorOneToOne;
import org.springframework.stereotype.Component;

/*** Created an interface for AuthorService ***/
@Component
public interface AuthorService {

  AuthorOneToOne saveAuthor(AuthorOneToOne author);

  AuthorOneToOne findAuthorByAuthorId(int authorId);
}
