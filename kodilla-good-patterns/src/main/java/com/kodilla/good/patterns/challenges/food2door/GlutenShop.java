package com.kodilla.good.patterns.challenges.food2door;

public class GlutenShop extends Shop {

    public GlutenShop(String name) {
        super(name);
    }

    @Override
    void process(OrderRequest orderRequest) {
        System.out.println();
        inform();
        System.out.println("Wysyłam maila z potw.");
        deliver();
    }
}
