package com.wadson.scanningapplication.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Product extends BaseEntity{

    private String name;
    private  String code;
    private String description;
    private  double price;
    private  int quantity;
}
