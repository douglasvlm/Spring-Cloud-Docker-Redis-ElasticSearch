package com.douglas.experts.productcatalog.repository;


import com.douglas.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
