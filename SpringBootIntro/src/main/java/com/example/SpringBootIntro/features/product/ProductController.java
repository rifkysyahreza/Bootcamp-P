package com.example.SpringBootIntro.features.product;

import com.example.SpringBootIntro.features.product.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping
    public String getProducts() {
        return "The get product HTTP request was sent";
    }

    @PostMapping
    public ResponseEntity<Product> createNewProduct(@org.jetbrains.annotations.NotNull @RequestParam("id") String id, @RequestParam("name") String name) {
        final String ALPHABET_AND_NUMBER = "^[a-zA-Z0-9]+$";

        if (!id.matches(ALPHABET_AND_NUMBER) || !name.matches(ALPHABET_AND_NUMBER)) {
            return ResponseEntity.badRequest().build();
        }

        Product product = new Product(id, name);
        return ResponseEntity.ok(product);

    }
}
