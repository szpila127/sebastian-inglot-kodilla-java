package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final TaskInterface makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Drive fast", "Krakow", "AUDI");
            case PAINTING_TASK:
                return new PaintingTask("Paint today!", "Black", "Volvo");
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping Time", "Everything", 1000);
                default:
                    return null;
        }
    }
}
