package com.kodilla.good.patterns.challenges.food2door;

import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        Producer producer = new Producer("FoodProducer");
        Product food = new Product("FOOD", 100);
        OrderNumber orderNumber = new OrderNumber(1);

        return new OrderRequest(producer, food, orderNumber);
    }
}
