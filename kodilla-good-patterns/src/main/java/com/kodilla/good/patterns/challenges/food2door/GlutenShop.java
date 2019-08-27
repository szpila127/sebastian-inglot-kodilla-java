package com.kodilla.good.patterns.challenges.food2door;

public class GlutenShop extends Shop {

    public GlutenShop(String name) {
        super(name);
    }

    @Override
    void process(OrderRequest orderRequest) {
        System.out.println("Wysłanie maila z potwierdzeniem złożenia zamówienia.");
        inform(orderRequest);
        deliver(orderRequest, 3);
    }
}
