package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        numbers[0] = 5;
        numbers[1] = 8;
        numbers[2] = 91;
        numbers[3] = 73;
        numbers[4] = 4;
        numbers[5] = 4;
        numbers[6] = 41;
        numbers[7] = 93;
        numbers[8] = 65;
        numbers[9] = 39;
        numbers[10] = 77;
        numbers[11] = 39;
        numbers[12] = 1;
        numbers[13] = 8;
        numbers[14] = 66;
        numbers[15] = 88;
        numbers[16] = 9;
        numbers[17] = 45;
        numbers[18] = 11;
        numbers[19] = 1;
        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(38.4, average, 0.01);

    }
}
