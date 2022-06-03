package com.wadson.scanningapplication.api.web;

import com.wadson.scanningapplication.api.entity.ProductScan;
import com.wadson.scanningapplication.api.service.ProductScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/productScans")
@CrossOrigin("*")
public class AppRestController {

    @Autowired
    private ProductScanService productScanService;

    @PostMapping
    public ResponseEntity<ProductScan> add(@RequestBody ProductScan productScan){
        productScan.setCreateAt(new Date());
        productScan.setUpdatedAt(new Date());
        return ResponseEntity.ok(this.productScanService.saveOrUpdate(productScan));
    }



    @PutMapping
    public ResponseEntity<ProductScan> update(@RequestBody ProductScan product){
        product.setUpdatedAt(new Date());
        return ResponseEntity.ok(this.productScanService.saveOrUpdate(product));
    }

    @GetMapping
    public ResponseEntity<List<ProductScan>> all(){
        return ResponseEntity.ok(this.productScanService.read());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        this.productScanService.delete(id);
    }

    @GetMapping("/{id}")
    public ProductScan findOne(@PathVariable("id") Long id){
        return this.productScanService.findOne(id);
    }
}
