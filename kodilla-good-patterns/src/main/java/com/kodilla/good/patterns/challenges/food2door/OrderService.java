package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {

    public boolean order(final Producer producer, final Product product, final OrderNumber orderNumber) {

        System.out.println("Zamówienie nr " + orderNumber.getNumber() + ": " + product.getName()
                + " x" + product.getAmount() + " u " + producer.getName());
        return true;
    }
}
