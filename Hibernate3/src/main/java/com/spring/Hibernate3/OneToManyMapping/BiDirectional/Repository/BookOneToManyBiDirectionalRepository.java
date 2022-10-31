package com.spring.Hibernate3.OneToManyMapping.BiDirectional.Repository;

import com.spring.Hibernate3.OneToManyMapping.BiDirectional.Entity.BookOneToManyBiDirectional;
import org.springframework.data.jpa.repository.JpaRepository;

/*** Created a repository for Book Entity ***/
public interface BookOneToManyBiDirectionalRepository extends JpaRepository<BookOneToManyBiDirectional, Long> {
}
