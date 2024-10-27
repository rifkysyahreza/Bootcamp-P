package com.example.FreshGoodiesBackEnd.favoriteProduct.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FavoriteProduct {
    private Long productId;
    private boolean isFavorite;
}
