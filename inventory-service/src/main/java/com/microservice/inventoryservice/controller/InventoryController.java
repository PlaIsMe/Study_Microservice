package com.microservice.inventoryservice.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.microservice.inventoryservice.dto.InventoryResponse;
import com.microservice.inventoryservice.pojo.Inventory;
import com.microservice.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Inventory create(@RequestBody Inventory inventory) {
        return inventoryService.add(inventory);
    }
}