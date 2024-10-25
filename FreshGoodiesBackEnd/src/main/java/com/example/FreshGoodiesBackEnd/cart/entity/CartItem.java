package com.example.FreshGoodiesBackEnd.cart.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
    private String id;
    private Long productId;
    private Integer quantity;
}
