// SimpleTask.java
package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimpleTask implements Task {
    private String taskName;
    private boolean done;
    private List<Observer> observers = new ArrayList<Observer>();

    public SimpleTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public void setTaskName(String name) {
        this.taskName = name;
        notifyObservers();
    }

    @Override
    public boolean isTaskDone() {
        return done;
    }

    @Override
    public void markTaskAsDone(boolean done) {
        this.done = done;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(done);
        }
    }
}
