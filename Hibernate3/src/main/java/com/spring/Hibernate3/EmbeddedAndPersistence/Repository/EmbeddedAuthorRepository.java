package com.spring.Hibernate3.EmbeddedAndPersistence.Repository;

import com.spring.Hibernate3.EmbeddedAndPersistence.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmbeddedAuthorRepository extends JpaRepository<Author, Integer> {

}
