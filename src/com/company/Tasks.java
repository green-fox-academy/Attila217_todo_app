package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private Path path;
    private ArrayList<Task> tasks;

    public Tasks() {
        this.path = Paths.get("data.txt");
        this.tasks = getTasksFromDatabase();
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    private ArrayList<Task> getTasksFromDatabase() {
        ArrayList<Task> tasks = new ArrayList<>();
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 1; i < lines.size(); i += 2) {
            boolean isDone = Boolean.parseBoolean(lines.get(i - 1));
            Task task = new Task(lines.get(i), isDone);
            tasks.add(task);
        }
        return tasks;
    }

    public void writeToDatabase() {
        ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            lines.add(String.valueOf(task.isDone()));
            lines.add(task.getTaskDescription());
        }
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
