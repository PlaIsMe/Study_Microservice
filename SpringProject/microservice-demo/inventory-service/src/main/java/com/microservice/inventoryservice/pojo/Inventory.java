package com.microservice.inventoryservice.pojo;

import lombok.Data;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
@Data
public class Inventory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String skuCode;
    private Integer quantity;
}