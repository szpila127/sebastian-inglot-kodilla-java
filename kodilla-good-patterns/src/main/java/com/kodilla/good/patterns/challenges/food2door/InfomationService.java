package com.kodilla.good.patterns.challenges.food2door;

public class InfomationService {

    public void inform(final Producer producer, final Product product, final OrderNumber orderNumber) {
        System.out.println("Informujemy, że " + producer.getName() + " zrealizował zamówenie nr " +
                orderNumber.getNumber() + " na: " + product.getName() + " x" + product.getAmount());
    }
}
