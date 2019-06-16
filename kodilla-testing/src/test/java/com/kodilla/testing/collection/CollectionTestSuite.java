package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        //When
        ArrayList<Integer> testList2 = new ArrayList<>(testList);
        OddNumbersExterminator.exterminate(testList2);
        System.out.println("Testing :" + testList);
        //Then
        Assert.assertEquals(testList, testList2);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(7);
        testList.add(10);
        testList.add(5);
        testList.add(8);
        testList.add(6);

        //When
        System.out.println("Testing method: OddNumberExterminator");
        ArrayList<Integer> testList2 = new ArrayList<>();
        testList2.add(10);
        testList2.add(8);
        testList2.add(6);

        ArrayList<Integer> testList3 = OddNumbersExterminator.exterminate(testList);

        //Then
        Assert.assertEquals(testList2, testList3);
    }
}
