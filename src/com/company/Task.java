package com.company;

public class Task {
    private String taskDescription;
    private boolean isDone;

    public Task(String taskDescription) {
        this(taskDescription, false);
    }

    public Task(String taskDescription, boolean isDone) {
        this.isDone = isDone;
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return (isDone ? "[x] " : "[ ] ") + taskDescription;
    }
}
