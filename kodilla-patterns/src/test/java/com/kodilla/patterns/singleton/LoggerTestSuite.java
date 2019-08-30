package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void openLogger() {
        Logger.getInstance();
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        Logger.getInstance().log("test1");
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("test1", log);
    }
}
