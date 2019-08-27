package com.kodilla.good.patterns.challenges.food2door;

abstract class Shop {

    private String name;

    public Shop(String name) {
        this.name = name;
    }

    abstract void process(OrderRequest orderRequest);

    public void inform(OrderRequest orderRequest) {
        System.out.println("Zlecenie na: " + orderRequest.getProduct().getName() + " x" +
                orderRequest.getProduct().getAmount() + " zostało przyjęte do realizacji w sklepie: " + name + ".");
    }

    public void deliver(OrderRequest orderRequest, int delayDay) {
        System.out.println("Towar zostanie wysłany " + delayDay + " dni od terminu zamówienia, czyli: " +
                orderRequest.getOrderTime().plusDays(delayDay));
    }

    public void sendInvoice(OrderRequest orderRequest) {
        System.out.println("Wysyłam fakturę do zamówienia " + orderRequest.getProduct().getName() + " x"
        + orderRequest.getProduct().getAmount());
    }
}
