// ComplexTaskAdapter.java
package com.company;

import java.util.ArrayList;
import java.util.List;

public class ComplexTaskAdapter implements Task {
    private ComplexTask complexTask;
    private List<Observer> observers = new ArrayList<Observer>();

    public ComplexTaskAdapter(ComplexTask complexTask) {
        this.complexTask = complexTask;
    }

    @Override
    public String getTaskName() {
        return complexTask.getTaskDescription();
    }

    @Override
    public void setTaskName(String name) {
        complexTask = new ComplexTask(name);
        notifyObservers();
    }

    @Override
    public boolean isTaskDone() {
        return complexTask.isTaskCompleted();
    }

    @Override
    public void markTaskAsDone(boolean done) {
        complexTask.completeTask(done);
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
            observer.update(isTaskDone());
        }
    }
}
