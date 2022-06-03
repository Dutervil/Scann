package com.wadson.scanningapplication.api.repo;

import com.wadson.scanningapplication.api.entity.ProductScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductScanRepo extends JpaRepository<ProductScan,Long> {
}
