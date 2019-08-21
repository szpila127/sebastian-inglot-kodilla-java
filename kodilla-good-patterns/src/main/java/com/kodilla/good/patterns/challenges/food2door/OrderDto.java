package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    public Shop shop;
    public boolean isOrdered;

    public OrderDto(Shop shop, boolean isOrdered) {
        this.shop = shop;
        this.isOrdered = isOrdered;
    }

    public Shop getShop() {
        return shop;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
