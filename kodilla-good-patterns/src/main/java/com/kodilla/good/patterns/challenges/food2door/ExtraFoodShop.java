package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends Shop {

    public ExtraFoodShop(String name) {
        super(name);
    }

    @Override
    void process(OrderRequest orderRequest) {
        inform(orderRequest);
        System.out.println("Powiadomienie SMS klienta o zamówieniu " + orderRequest.getProduct().getName());
        deliver(orderRequest, 1);
        sendInvoice(orderRequest);
    }
}
