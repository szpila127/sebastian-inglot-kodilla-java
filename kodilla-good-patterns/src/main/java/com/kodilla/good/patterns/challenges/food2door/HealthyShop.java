package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends Shop {

    public HealthyShop(String name) {
        super(name);
    }

    @Override
    void process(OrderRequest orderRequest) {
        inform(orderRequest);
        deliver(orderRequest, 2);
    }
}
