package com.spring.security.Repositories;

import com.spring.security.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
  Product findByCode(String code);
}
