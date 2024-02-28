package com.microservice.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.orderservice.pojo.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {
    
}
