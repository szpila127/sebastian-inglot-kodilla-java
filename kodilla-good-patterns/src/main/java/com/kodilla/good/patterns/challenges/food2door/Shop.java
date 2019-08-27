package com.kodilla.good.patterns.challenges.food2door;

abstract class Shop {

    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void process(OrderRequest orderRequest);

    public void inform() {
        System.out.println("Informuje klienta");
    }

    public void deliver() {
        System.out.println("Wysyłka");
    }

    public void sendInvoice() {
        System.out.println("Wysyłam fakturę");
    }
}
