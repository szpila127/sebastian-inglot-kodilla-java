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
    public void calculateAdvStatisticsWithMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> staticticsList = new LinkedList<>();
        int postsCount = 0;
        int commentsCount = 0;

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(staticticsList);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, advStatistics.getAvPostsPerUser(), 0.01);
        Assert.assertEquals(0, advStatistics.getAvCommentsPerPost(), 0.01);
        Assert.assertEquals(0, advStatistics.getAvCommentsPerUser(), 0.01);
        Assert.assertEquals(0, advStatistics.getCommentsQuantitny());
        Assert.assertEquals(0, advStatistics.getPostsQuantity());
        Assert.assertEquals(0, advStatistics.getUsersQuantity());
    }

    @Test
    public void calculateAdvStatisticsWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> staticticsList = new LinkedList<>();
        for(int i = 0; i < 100; i++) {
            staticticsList.add("Test");
        }
        int postsCount = 1000;
        int commentsCount = 500;

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(staticticsList);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, advStatistics.getAvPostsPerUser(), 0.01);
        Assert.assertEquals(0.5, advStatistics.getAvCommentsPerPost(), 0.01);
        Assert.assertEquals(5, advStatistics.getAvCommentsPerUser(), 0.01);
        Assert.assertEquals(500, advStatistics.getCommentsQuantitny());
        Assert.assertEquals(1000, advStatistics.getPostsQuantity());
        Assert.assertEquals(100, advStatistics.getUsersQuantity());
    }

    @Test
    public void calculateAdvStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> staticticsList = new LinkedList<>();
        for(int i = 0; i < 100; i++) {
            staticticsList.add("Test");
        }
        int postsCount = 500;
        int commentsCount = 1000;

        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.usersNames()).thenReturn(staticticsList);

        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(5, advStatistics.getAvPostsPerUser(), 0.01);
        Assert.assertEquals(2, advStatistics.getAvCommentsPerPost(), 0.01);
        Assert.assertEquals(10, advStatistics.getAvCommentsPerUser(), 0.01);
        Assert.assertEquals(1000, advStatistics.getCommentsQuantitny());
        Assert.assertEquals(500, advStatistics.getPostsQuantity());
        Assert.assertEquals(100, advStatistics.getUsersQuantity());
    }
}
