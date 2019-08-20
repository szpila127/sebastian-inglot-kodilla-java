package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {

    private Producer producer;
    private Product product;
    private OrderNumber orderNumber;

    public OrderRequest(Producer producer, Product product, OrderNumber orderNumber) {
        this.producer = producer;
        this.product = product;
        this.orderNumber = orderNumber;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public OrderNumber getOrderNumber() {
        return orderNumber;
    }
}
