package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderService {

    public boolean order(final User user, final Product product, final LocalDateTime orderTime) {

        System.out.println("Zamówienie produktu: " + product.getName() + " x" + product.getAmount() + " dla " +
                user.getName() + " " + user.getSurname() + ", " + user.getNickname() + ". " +
                orderTime);

        return true;
    }
}
