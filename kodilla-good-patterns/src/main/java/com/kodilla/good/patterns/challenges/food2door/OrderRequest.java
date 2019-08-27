package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {

    private Product product;

    public OrderRequest(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
