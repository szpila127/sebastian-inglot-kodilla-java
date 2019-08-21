package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve1() {

        Product food = new Product("FOOD", 100);

        return new OrderRequest(food);
    }

    public OrderRequest retrieve2() {

        Product drinks = new Product("DRINKS", 200);

        return new OrderRequest(drinks);
    }
}
