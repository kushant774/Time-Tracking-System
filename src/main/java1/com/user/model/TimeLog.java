package com.user.model;

import java.util.Date;

public class TimeLog {
    private int id; // Unique identifier for the time log
    private int userId; // ID of the user who logged the time
    private String taskDescription; // Description of the task
    private int hoursWorked; // Hours worked on the task
    private Date date; // Date of the time log

    // Default Constructor
    public TimeLog() {
    }

    // Parameterized Constructor
    public TimeLog(int id, int userId, String taskDescription, int hoursWorked, Date date) {
        this.id = id;
        this.userId = userId;
        this.taskDescription = taskDescription;
        this.hoursWorked = hoursWorked;
        this.date = date;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Overriding toString() for better debugging and logging
    @Override
    public String toString() {
        return "TimeLog{" +
                "id=" + id +
                ", userId=" + userId +
                ", taskDescription='" + taskDescription + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", date=" + date +
                '}';
    }
}
