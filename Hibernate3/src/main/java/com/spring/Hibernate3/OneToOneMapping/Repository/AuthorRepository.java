package com.spring.Hibernate3.OneToOneMapping.Repository;

import com.spring.Hibernate3.OneToOneMapping.Entity.AuthorOneToOne;
import org.springframework.data.jpa.repository.JpaRepository;

/*** Created an AuthorRepository here ***/
public interface AuthorRepository extends JpaRepository<AuthorOneToOne, String> {
  AuthorOneToOne findAuthorByAuthorId(int authorId);
}
