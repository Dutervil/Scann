package com.wadson.scanningapplication.api.repo;

import com.wadson.scanningapplication.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByCode(String code);
}
