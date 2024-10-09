package atu.ie.week3_recap_docker;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {
    private final List<Product> inventoryList = new ArrayList<>();

    public String addProduct(Product product) {
        inventoryList.add(product);
        return "Product added successfully to inventory";
    }
}