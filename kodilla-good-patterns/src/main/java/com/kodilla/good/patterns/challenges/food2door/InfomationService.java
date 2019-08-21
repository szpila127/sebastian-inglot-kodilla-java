package com.kodilla.good.patterns.challenges.food2door;

public class InfomationService {

    public void inform(final Shop shop, final Product product) {
        System.out.println("Informujemy, że " + shop.getName() + " zrealizował zamówenie na: " +
                product.getName() + " x" + product.getAmount());
    }
}
