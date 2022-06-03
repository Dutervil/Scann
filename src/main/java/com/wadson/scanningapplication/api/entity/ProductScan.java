package com.wadson.scanningapplication.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class ProductScan extends  BaseEntity{

    private String cashier_name;

    private  String scanner_id;

    private  String product_code;
    @Basic
    @Temporal(TemporalType.DATE)
    private Date date_scan;

}
