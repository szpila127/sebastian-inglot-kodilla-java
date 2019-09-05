package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements TaskInterface {
    final String taskName;
    final String color;
    final String whatToPaint;
    static boolean execute;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        return color + " " + whatToPaint;
    }
}
