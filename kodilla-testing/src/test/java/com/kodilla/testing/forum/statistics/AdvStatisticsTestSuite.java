package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculateAdvStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> staticticsList = new LinkedList<>();
        staticticsList.add("Sebastian");
        staticticsList.add("Michał");
        int postsCount = 2;
        int commentsCount = 1;

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(staticticsList);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
//        Assert.assertEquals(100, advStatistics.getAvPostsPerUser(), 0.01);
        Assert.assertEquals(0.5, advStatistics.getAvCommentsPerPost(), 0.01);
//        Assert.assertEquals(0, advStatistics.getAvCommentsPerUser(), 0.01);
//        Assert.assertEquals(500, advStatistics.getCommentsQuantitny());
//        Assert.assertEquals(20, advStatistics.getPostsQuantity());
//        Assert.assertEquals(2, advStatistics.getUsersQuantity());
    }
}
