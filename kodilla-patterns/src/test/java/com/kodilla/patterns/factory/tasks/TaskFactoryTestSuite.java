package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //When
        TaskFactory factory = new TaskFactory();
        //Then
        TaskInterface shoppingTask = factory.makeTask(TaskType.SHOPPING_TASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Shopping Time", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //When
        TaskFactory factory = new TaskFactory();
        //Then
        TaskInterface paintingTask = factory.makeTask(TaskType.PAINTING_TASK);
        //Then
        Assert.assertEquals("Paint today!", paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //When
        TaskFactory factory = new TaskFactory();
        //Then
        TaskInterface drivingTask = factory.makeTask(TaskType.DRIVING_TASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("Krakow AUDI", drivingTask.executeTask());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
