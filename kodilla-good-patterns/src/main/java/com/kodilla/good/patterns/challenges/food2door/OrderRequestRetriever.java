package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve1() {

        Product chleb = new Product("CHLEB", 100);
        LocalDateTime orderTime = LocalDateTime.of(2019,11,11,11,11);

        return new OrderRequest(chleb, orderTime);
    }

    public OrderRequest retrieve2() {

        Product drinks = new Product("DRINK", 200);
        LocalDateTime orderTime = LocalDateTime.of(2019,1,21,21,14);

        return new OrderRequest(drinks, orderTime);
    }
}
