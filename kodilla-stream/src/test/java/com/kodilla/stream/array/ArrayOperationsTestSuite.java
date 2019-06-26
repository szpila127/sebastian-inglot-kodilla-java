package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {5, 8, 91, 73, 4, 4, 41, 93, 65, 39, 77, 39, 1, 8, 66, 88, 9, 45, 11, 1};

//        int[] numbers = null;
        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(38.4, average, 0.01);

    }
}
