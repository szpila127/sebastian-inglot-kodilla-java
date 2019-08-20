package com.kodilla.good.patterns.challenges.food2door;

public class OrderDto {

    public Producer producer;
    public boolean isOrdered;

    public OrderDto(Producer producer, boolean isOrdered) {
        this.producer = producer;
        this.isOrdered = isOrdered;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
