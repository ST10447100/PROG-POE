/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poep1;

/**
 *
 * @author RC_Student_lab
 */
class Task {
     String id;
    String name;
    String description;
    String devFirstName;
    String devLastName;
    int duration;
    String status;

    public Task(String id, String name, String description, String devFirstName, String devLastName, int duration) {
//        (link unavailable) = id;
        this.name = name;
        this.description = description;
        this.devFirstName = devFirstName;
        this.devLastName = devLastName;
        this.duration = duration;
        this.status = "To Do";
    }

    public static boolean checkTaskDescription(String description) {
        return description.length() <= 50;
    }

    public static String createTaskID(String name, int number, String devLastName) {
        return (name.substring(0, 2) + ":" + number + ":" + devLastName.substring(devLastName.length() - 3)).toUpperCase();
    }

    public String printTaskDetails() {
        return "Task Status: " + status + "\nDeveloper Details: " + devFirstName + " " + devLastName + "\nTask Number: " + id.split(":")[1] + "\nTask Name: " + name + "\nTask Description: " + description + "\nTask ID: " + id + "\nDuration: " + duration + " hours";
    }

    public int returnTotalHours(Task[] tasks) {
        int totalHours = 0;
        for (Task task : tasks) {
            totalHours += task.duration;
        }
        return totalHours;
    }
}

