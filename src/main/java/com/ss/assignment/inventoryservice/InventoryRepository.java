package com.ss.assignment.inventoryservice;

import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Integer>{
    
}
