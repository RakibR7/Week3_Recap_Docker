package atu.ie.week3_recap_docker;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {this.inventoryService = inventoryService;}

    @PostMapping("/add")
    public String addProduct(@Valid @RequestBody Product product) {
        return inventoryService.addProduct(product);
    }
}
