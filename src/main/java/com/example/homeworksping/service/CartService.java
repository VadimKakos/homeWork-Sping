package com.example.homeworksping.service;

import com.example.homeworksping.reporitory.CartBasket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartBasket basket;

    public CartService(CartBasket cartBasket) {
        this.basket = cartBasket;
    }

    public void addToCart(List<Integer> ids) {
        this.basket.addToCart(ids);
    }

    public List<Integer> getCart() {
        return this.basket.getCart();
    }
}
