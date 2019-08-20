package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private InfomationService infomationService;
    private OrderService orderService;

    public OrderProcessor(final InfomationService infomationService,
                          final OrderService orderService) {
        this.infomationService = infomationService;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProducer(),
                orderRequest.getProduct(), orderRequest.getOrderNumber());
        if (isOrdered) {
            infomationService.inform(orderRequest.getProducer(), orderRequest.getProduct(), orderRequest.getOrderNumber());
            return new OrderDto(orderRequest.getProducer(), true);
        } else {
            return new OrderDto(orderRequest.getProducer(), false);
        }
    }
}
