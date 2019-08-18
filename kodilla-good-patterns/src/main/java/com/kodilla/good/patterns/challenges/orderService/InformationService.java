package com.kodilla.good.patterns.challenges.orderService;

public class InformationService {

    public void inform(final User user, final Product product) {
        System.out.println("Informujemy " + user.getNickname() + ", " + user.getName() + " " + user.getSurname() +
                ": przyjęto zlecenie na zamówienie: " + product.getName() + " x" + product.getAmount());
    }
}
