package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        //When
        String description = pizza.getDescription();
        //Then
        Assert.assertEquals("Pizza witch cheese and tomato sauce", description);
    }

    @Test
    public void testBasicPizzaOrderExtraCheeseGarlicSauceGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new GarlicSauceDecorator(pizza);
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(22), theCost);
    }

    @Test
    public void testBasicPizzaOrderExtraCheeseGarlicSauceGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new GarlicSauceDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        Assert.assertEquals("Pizza witch cheese and tomato sauce + extra cheese + garlic sauce", description);
    }
}
