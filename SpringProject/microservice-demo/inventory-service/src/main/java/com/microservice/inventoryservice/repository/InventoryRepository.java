package com.microservice.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.inventoryservice.pojo.Inventory;

import java.util.List;


public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}