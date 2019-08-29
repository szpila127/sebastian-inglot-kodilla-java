package com.kodilla.spring.portfolio;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public boolean addToDoTask(String task) {
        return toDoList.addTask(task);
    }

    public boolean addInProgressTask(String task) {
        return inProgressList.addTask(task);
    }

    public boolean addDoneTask(String task) {
        return doneList.addTask(task);
    }

    public String getToDoTask(int index) {
        return toDoList.getTask(index);
    }

    public String getInProgressTask(int index) {
        return inProgressList.getTask(index);
    }

    public String getDoneTask(int index) {
        return doneList.getTask(index);
    }

}
