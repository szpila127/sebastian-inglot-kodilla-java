package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Continent europe = new Continent("Europa");
        europe.addCountry(new Country("Polska", new BigDecimal("1010101010")));
        europe.addCountry(new Country("Hiszpania", new BigDecimal("3232323")));
        europe.addCountry(new Country("Anglia", new BigDecimal("232116622")));
        europe.addCountry(new Country("Ukraina", new BigDecimal("12177333")));

        Continent asia = new Continent("Azja");
        asia.addCountry(new Country("Rosja", new BigDecimal("33234232342")));
        asia.addCountry(new Country("Chiny", new BigDecimal("3323232432224242424")));
        asia.addCountry(new Country("Indie", new BigDecimal("7327329372392734923")));

        Continent northAmerica = new Continent("Ameryka Północna");
        northAmerica.addCountry(new Country("Stany Zjednoczone", new BigDecimal("433232232332")));
        northAmerica.addCountry(new Country("Kanada", new BigDecimal("9009559")));

        //When
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        BigDecimal actualPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("232116622");
        Assert.assertEquals(expectedPopulation, actualPopulation);
    }
}
