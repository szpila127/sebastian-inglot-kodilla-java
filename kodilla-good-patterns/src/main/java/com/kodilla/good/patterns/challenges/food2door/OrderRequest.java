package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDateTime;

public class OrderRequest {

    private Product product;
    private LocalDateTime orderTime;

    public OrderRequest(Product product, LocalDateTime orderTime) {
        this.product = product;
        this.orderTime = orderTime;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
