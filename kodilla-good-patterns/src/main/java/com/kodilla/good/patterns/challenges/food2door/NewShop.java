package com.kodilla.good.patterns.challenges.food2door;

public class NewShop extends Shop {

    public NewShop(String name) {
        super(name);
    }

    public OrderDto process(Shop shop, OrderRequest orderRequest) {
        InfomationService infomationService = new InfomationService();
        OrderService orderService = new OrderService();
        boolean isOrdered = orderService.order(shop, orderRequest.getProduct());
        if (isOrdered) {
            infomationService.inform(shop, orderRequest.getProduct());
            return new OrderDto(shop, true);
        } else {
            return new OrderDto(shop, false);
        }
    }

}
