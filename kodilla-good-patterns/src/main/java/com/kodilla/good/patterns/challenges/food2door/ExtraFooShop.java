package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFooShop extends Shop {

    public ExtraFooShop(String name) {
        super(name);
    }

    @Override
    void process(OrderRequest orderRequest) {
        System.out.println();
        inform();
        deliver();
        sendInvoice();
    }
}
