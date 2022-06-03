package com.wadson.scanningapplication.api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date createAt;


    @Basic
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
}
