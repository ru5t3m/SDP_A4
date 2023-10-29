// Task.java
package com.company;

import java.util.ArrayList;
import java.util.List;

public interface Task {
    String getTaskName();
    void setTaskName(String name);
    boolean isTaskDone();
    void markTaskAsDone(boolean done);

    // Observer pattern methods
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
