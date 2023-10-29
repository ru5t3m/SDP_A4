// TaskStatusObserver.java
package com.company;

public class TaskStatusObserver implements Observer {
    private Task task;

    public TaskStatusObserver(Task task) {
        this.task = task;
        task.registerObserver(this);
    }

    @Override
    public void update(boolean taskStatus) {
        System.out.println("Task Status Updated: " + (taskStatus ? "Done" : "Not Done"));
    }
}
