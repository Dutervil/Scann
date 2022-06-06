package com.wadson.scanningapplication.api.service;

import com.wadson.scanningapplication.api.entity.Product;
import com.wadson.scanningapplication.api.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product){
        return this.productRepository.save(product);
    }

    public List<Product>  productList()
    {
        return this.productRepository.findAll();
    }

    public Product findByCode(String code){
        return this.productRepository.findByCode(code);
    }
}

