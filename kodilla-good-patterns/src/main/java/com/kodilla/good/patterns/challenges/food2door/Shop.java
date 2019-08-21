package com.kodilla.good.patterns.challenges.food2door;

abstract class Shop {

    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    abstract OrderDto process(Shop shop, OrderRequest orderRequest);
}
