package com.spring.Hibernate3.OneToManyMapping.UniDirectional.Repository;

import com.spring.Hibernate3.OneToManyMapping.UniDirectional.Entity.AuthorOneToManyUniDirectional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*** Created Author repository here **/
@Repository
public interface AuthorOneToManyRepositoryUniDirectional extends JpaRepository<AuthorOneToManyUniDirectional, Long> {
}
