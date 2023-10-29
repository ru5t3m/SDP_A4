package com.company;

public class ComplexTask {
    private String taskDescription;
    private boolean completed;

    public ComplexTask(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isTaskCompleted() {
        return completed;
    }

    public void completeTask(boolean completed) {
        this.completed = completed;
    }
}