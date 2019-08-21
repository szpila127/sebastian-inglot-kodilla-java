package com.kodilla.good.patterns.challenges.food2door;

public class OrderService {

    public boolean order(final Shop shop, final Product product) {

        System.out.println("Zamówienie: " + product.getName()
                + " x" + product.getAmount() + " u " + shop.getName());
        return true;
    }
}
