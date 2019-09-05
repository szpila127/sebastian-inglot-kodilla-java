package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final TaskInterface makeTask(TaskBase taskBase) {
        switch (taskBase) {
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
