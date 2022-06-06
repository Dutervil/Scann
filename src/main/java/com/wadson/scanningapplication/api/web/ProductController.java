package com.wadson.scanningapplication.api.web;

import com.wadson.scanningapplication.api.entity.Product;
import com.wadson.scanningapplication.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product  product){
        return ResponseEntity.ok(this.productService.save(product));
    }

    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(this.productService.productList());
    }

    @GetMapping("/{code}")
    public ResponseEntity<?> findOne(@PathVariable("code") String code){
        return ResponseEntity.ok(this.productService.findByCode(code));
    }
}
