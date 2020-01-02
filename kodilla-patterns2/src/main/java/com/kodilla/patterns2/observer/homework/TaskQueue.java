package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskQueue implements ObservableHW {
    private final List<ObserverHW> mentors;
    private final List<String> tasks;
    private final String name;

    public TaskQueue(String name) {
        mentors = new ArrayList<>();
        tasks = new LinkedList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserverHW("New task: " + task);
    }

    public void removeTask() {
        if (!tasks.isEmpty()) {
            String task = tasks.get(0);
            tasks.remove(0);
            notifyObserverHW("Remove " + task);
        }  else {
            System.out.println("Empty list !");
        }
    }

    @Override
    public void registerObserverHW(ObserverHW observerHW) {
        mentors.add(observerHW);
    }

    @Override
    public void notifyObserverHW(String action) {
        for (ObserverHW mentor : mentors) {
            mentor.update(this, action);
        }
    }

    @Override
    public void removeObserverHW(ObserverHW observerHW) {
        mentors.remove(observerHW);
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
