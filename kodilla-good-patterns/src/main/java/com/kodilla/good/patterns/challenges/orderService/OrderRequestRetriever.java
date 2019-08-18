package com.kodilla.good.patterns.challenges.orderService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Sebastian", "Inglot", "szpila");
        Product camera = new Product("Camera", 1);
        LocalDateTime orderTime = LocalDateTime.of(2019, 11, 23, 11, 59);

        return new OrderRequest(user, camera, orderTime);
    }
}
