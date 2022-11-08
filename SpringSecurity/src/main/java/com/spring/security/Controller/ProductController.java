package com.spring.security.Controller;

import com.spring.security.Entity.Product;
import com.spring.security.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productapi")
public class ProductController {

  @Autowired
  ProductRepository productRepository;

  @PostMapping(value = "/products")
  public Product create(@RequestBody Product product) {
    return productRepository.save(product);
  }

  @GetMapping(value = "/products/{prod_name}")
  public Product getCoupons(@PathVariable("prod_name") String code) {
    return productRepository.findByCode(code);
  }

}
