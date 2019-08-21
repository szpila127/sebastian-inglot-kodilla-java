package com.kodilla.good.patterns.challenges.food2door;

public class App {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest1 = orderRequestRetriever.retrieve1();
        OrderRequest orderRequest2 = orderRequestRetriever.retrieve2();

        NewShop healthyShop = new NewShop("HealthyShop");
        healthyShop.process(healthyShop, orderRequest1);

        NewShop glutenFreeShop = new NewShop("GlutenFreeShop");
        glutenFreeShop.process(glutenFreeShop, orderRequest2);

    }
}
