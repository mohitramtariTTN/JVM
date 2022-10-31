package com.spring.Hibernate3.ManyToManyMapping.Repository;

import com.spring.Hibernate3.ManyToManyMapping.Entity.AuthorManyToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*** Created the repository for Author here ***/
@Repository
public interface AuthorManyToManyRepository extends JpaRepository<AuthorManyToMany, Long> {
}
