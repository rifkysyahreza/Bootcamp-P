package com.example.FreshGoodiesBackEnd.favoriteProduct;

import com.example.FreshGoodiesBackEnd.favoriteProduct.service.FavoriteProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/favorites")
public class FavoriteProductController {

    private final FavoriteProductService favoriteProductService;

    public FavoriteProductController(FavoriteProductService service) {
        this.favoriteProductService = service;
    }

    @PostMapping("/toggle")
    public void toggleFavorite(@RequestBody Long productId) {
//        favoriteProductService.toggleFavorite(productId);

    }
}
