package com.kodilla.good.patterns.challenges.orderService;

public class App {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new InformationService(),
                new OrderService(), new OrderRepository());
        orderProcessor.process(orderRequest);
    }
}
