package com.kodilla.testing.collection;

import org.junit.*;

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
        ArrayList<Integer> testList2;
        testList2 = testList;
        OddNumbersExterminator.exterminate(testList2);
        System.out.println(testList2);
        //Then
        Assert.assertEquals(testList,testList2);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            testList.add(i);
        }
        //When
        ArrayList<Integer> testList2;
        testList2 = testList;
        OddNumbersExterminator.exterminate(testList2);
        System.out.println(testList2);
        //Then
        Assert.assertEquals(testList,testList2);
    }
}
