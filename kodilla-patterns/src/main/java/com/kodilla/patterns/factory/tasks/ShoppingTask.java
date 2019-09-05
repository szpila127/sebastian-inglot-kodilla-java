package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements TaskInterface {
    final String taskName;
    final String whatToBuy;
    final double qiantity;
    static boolean execute;

    public ShoppingTask(String taskName, String whatToBuy, double qiantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.qiantity = qiantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean result = false;
        if (execute) {
            result = true;
        }
        return result;
    }

    @Override
    public String executeTask() {
        execute = true;
        return whatToBuy + " " + qiantity;
    }
}
