package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderRepository {

    public void createOrder(final User user, final Product product, final LocalDateTime orderTime) {
        System.out.println("Utworzono zamówienie dla " + user.getNickname() + ", " + user.getName() + " "
                + user.getSurname() + " na " + product.getName() + ": " + orderTime);
    }

}