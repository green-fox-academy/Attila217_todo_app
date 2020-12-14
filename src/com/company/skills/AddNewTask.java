package com.company.skills;

import com.company.Task;

public class AddNewTask extends Skill {
    public AddNewTask() {
        command = "-a";
        description = "Új feladatot ad hozzá";
    }

    @Override
    public void action(String[] args) {
        Task task = null;
        try {
            task = new Task(args[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nem lehetséges új feladat hozzáadása: nincs megadva a feladat!");
            return;
        }
        tasks.getTasks().add(task);
        tasks.writeToDatabase();
        System.out.println("Feladat a listához adva");
    }
}
