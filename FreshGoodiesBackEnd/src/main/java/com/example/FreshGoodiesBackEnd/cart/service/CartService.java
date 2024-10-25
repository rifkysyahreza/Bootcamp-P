package com.example.FreshGoodiesBackEnd.cart.service;

import com.example.FreshGoodiesBackEnd.cart.entity.CartItem;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class CartService {

    // DB repository mock
    private Map<String, CartItem> repository = Arrays.stream(
            new CartItem[] {
                    new CartItem(){{
                        setId("e3482c80-4d39-4bde-be1c-7e1f7db0d9bf");
                        setProductId(1L);
                        setQuantity(1);
                    }},
                    new CartItem(){{
                        setId("162a4159-4633-4391-826a-56e78d0435c1");
                        setProductId(2L);
                        setQuantity(2);
                    }},
            }
    ).collect(Collectors.toConcurrentMap(CartItem::getId, cartItem -> cartItem));

    public List<CartItem> getAll() {
        return new ArrayList<>(repository.values());
    }

    public CartItem getById(String id) {
        return repository.get(id);
    }

    public CartItem create(CartItem newCartItem) {
        String key = UUID.randomUUID().toString();
        newCartItem.setId(key);
        repository.put(key, newCartItem);
        return newCartItem;
    }

    public CartItem update(String id, CartItem updatedCartItem) {
        updatedCartItem.setId(id);
        updatedCartItem.setProductId(repository.get(id).getProductId());
        repository.put(id, updatedCartItem);
        return updatedCartItem;
    }

    public void delete(String id){
        repository.remove(id);
    }
}
