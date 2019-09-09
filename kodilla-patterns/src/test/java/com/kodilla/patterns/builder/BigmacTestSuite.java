package com.kodilla.patterns.builder;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigMac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .burgers(3)
                .sauce("Spicy")
                .bun("Thin")
                .ingredient("Ham")
                .ingredient("Cheese")
                .build();
        System.out.println(bigMac);
        //When
        boolean ifContainsOnion = bigMac.getIngredients().contains("Onion");
        String whithSauce = bigMac.getSauce();
        int howManyBurgers = (int) bigMac.getBurgers();
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertTrue(ifContainsOnion);
        Assert.assertEquals(3, howManyBurgers);
        Assert.assertEquals("Spicy", whithSauce);
        Assert.assertEquals(3, howManyIngredients);
    }
}
