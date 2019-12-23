package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHW {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskQueue taskQueue, String action) {
        System.out.println(username + ": " + action + " -> " + taskQueue.getName() + "\n" +
                " (total: " + taskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
