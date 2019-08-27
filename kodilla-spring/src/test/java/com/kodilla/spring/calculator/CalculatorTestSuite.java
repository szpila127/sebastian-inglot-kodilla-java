package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2, 3);
        double sub = calculator.sub(10, 3);
        double mul = calculator.mul(2, 3);
        double div = calculator.div(27, 3);
        //Then
        Assert.assertEquals(5, add, 0.01);
        Assert.assertEquals(7, sub, 0.01);
        Assert.assertEquals(6, mul, 0.01);
        Assert.assertEquals(9, div, 0.01);

    }
}
