// TaskFactory.java
package com.company;

public class TaskFactory {
    public static Task createSimpleTask(String name) {
        return new SimpleTask(name);
    }

    public static Task createComplexTask(String description) {
        ComplexTask complexTask = new ComplexTask(description);
        return new ComplexTaskAdapter(complexTask);
    }
}
