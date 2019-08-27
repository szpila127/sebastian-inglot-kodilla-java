package com.kodilla.good.patterns.challenges.food2door;

public class App {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest1 = orderRequestRetriever.retrieve1();
        OrderRequest orderRequest2 = orderRequestRetriever.retrieve2();

        GlutenShop glutenShop = new GlutenShop("GlutenShop");
        glutenShop.process(orderRequest1);

        System.out.println();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop");
        extraFoodShop.process(orderRequest2);
    }
}
