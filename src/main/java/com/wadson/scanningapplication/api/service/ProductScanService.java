package com.wadson.scanningapplication.api.service;

import com.wadson.scanningapplication.api.entity.ProductScan;
import com.wadson.scanningapplication.api.repo.ProductScanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service @Transactional
public class ProductScanService {

    @Autowired
    private ProductScanRepo productScanRepo;

    public ProductScan saveOrUpdate(ProductScan product){

        return this.productScanRepo.save(product);
    }

    public List<ProductScan> read(){return this.productScanRepo.findAll();}

    public void delete(Long id){
        this.productScanRepo.deleteById(id);
    }

    public  ProductScan findOne(Long id){
        return this.productScanRepo.findById(id).orElse(new ProductScan());
    }


}
