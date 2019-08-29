package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public boolean addTask(String task) {
        return tasks.add(task);
    }

    public String getTask(int index) {
        return tasks.get(index);
    }

    public int size() {
        return tasks.size();
    }
}
