package com.spring.Hibernate3.ManyToManyMapping.Repository;

import com.spring.Hibernate3.ManyToManyMapping.Entity.BookManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*** Created a repository for book here ***/
@Repository
public interface BookManyToManyRepository extends JpaRepository<BookManyToMany, Long> {
}
