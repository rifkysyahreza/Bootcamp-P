package com.example.SpringBootIntro.features.cart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

    @GetMapping
    public String getCart() {
        return "The get cart HTTP request was sent";
    }
}
