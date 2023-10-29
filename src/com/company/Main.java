package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name for your simple task: ");
        String simpleTaskName = scanner.nextLine();

        Task simpleTask = TaskFactory.createSimpleTask(simpleTaskName);
        TaskStatusObserver simpleTaskObserver = new TaskStatusObserver(simpleTask);

        System.out.print("Enter a description for your complex task: ");
        String complexTaskDescription = scanner.nextLine();

        Task complexTask = TaskFactory.createComplexTask(complexTaskDescription);
        TaskStatusObserver complexTaskObserver = new TaskStatusObserver(complexTask);

        displayTaskDetails(simpleTask);
        displayTaskDetails(complexTask);

        System.out.println("Do you want to update the task status? (yes/no): ");
        String updateChoice = scanner.nextLine();
        if (updateChoice.equalsIgnoreCase("yes")) {
            updateTaskStatus(simpleTask, scanner);
            updateTaskStatus(complexTask, scanner);
        }

        scanner.close();
    }

    public static void displayTaskDetails(Task task) {
        System.out.println("Task Name: " + task.getTaskName());
        System.out.println("Task Status: " + (task.isTaskDone() ? "Done" : "Not Done"));
    }

    public static void updateTaskStatus(Task task, Scanner scanner) {
        System.out.print("Mark task as done? (yes/no): ");
        String userChoice = scanner.nextLine();
        if (userChoice.equalsIgnoreCase("yes")) {
            task.markTaskAsDone(true);
        }
        else{
            task.markTaskAsDone(false);
        }
    }
}
