/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poep1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class EasyKanbanApp {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to EasyKanban");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login successful");

            System.out.print("Enter the number of tasks you wish to enter: ");
            int numTasks = scanner.nextInt();

            Task[] tasks = new Task[numTasks];

            for (int i = 0; i < numTasks; i++) {
                System.out.print("Enter task name: ");
                String name = scanner.next();
                System.out.print("Enter task description: ");
                String description = scanner.next();
                if (!Task.checkTaskDescription(description)) {
                    System.out.println("Please enter a task description of less than 50 characters");
                    i--;
                } else {
                    System.out.println("Task successfully captured");
                    System.out.print("Enter developer first name: ");
                    String devFirstName = scanner.next();
                    System.out.print("Enter developer last name: ");
                    String devLastName = scanner.next();
                    System.out.print("Enter estimated duration (hours): ");
                    int duration = scanner.nextInt();

                    String taskID = Task.createTaskID(name, i, devLastName);

                    tasks[i] = new Task(taskID, name, description, devFirstName, devLastName, duration);
                    JOptionPane.showMessageDialog(null, tasks[i].printTaskDetails());
                }
            }

            while (true) {
                System.out.println("\nOptions:");
                System.out.println("1. Add tasks");
                System.out.println("2. Show report");
                System.out.println("3. Quit");

                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        // Add tasks
                        break;
                    case 2:
                        System.out.println("Coming Soon");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            }
        } else {
            System.out.println("Login failed");
        }
    }
}
