package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements TaskInterface {
    final String taskName;
    final String where;
    final String using;
    static boolean execute = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
        return where + " " + using;
    }

}
