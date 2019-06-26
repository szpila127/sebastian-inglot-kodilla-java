package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {5, 8, 91, 73, 4, 4, 41, 93, 65, 39, 77, 39, 1, 8, 66, 88, 9, 45, 11, 1};
        int[] numbers2 = new int[0];
        //When
        double average = ArrayOperations.getAverage(numbers);
        double average2 = ArrayOperations.getAverage(numbers2);

        //Then
        Assert.assertEquals(38.4, average, 0.01);
        Assert.assertEquals(0, average2, 0.01);

    }
}
