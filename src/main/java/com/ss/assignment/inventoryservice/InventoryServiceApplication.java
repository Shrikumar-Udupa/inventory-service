package com.ss.assignment.inventoryservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InventoryServiceApplication {

	@Autowired
	private InventoryRepository inventoryRepository;

	@PostMapping(path = "additems")
	public @ResponseBody Inventory registerItem(@RequestParam String name, @RequestParam String description) {
		Inventory item = new Inventory();
		item.setName(name);
		item.setDescription(description);
		return inventoryRepository.save(item);
	}

	@GetMapping(path= "getItems")
	public @ResponseBody Iterable<Inventory> getItems()
	{
		return inventoryRepository.findAll();
	}

	@GetMapping(path= "getItem")
	public @ResponseBody Optional<Inventory> getItem(@RequestParam Integer id)
	{
		return inventoryRepository.findById(id);
	}

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
}
