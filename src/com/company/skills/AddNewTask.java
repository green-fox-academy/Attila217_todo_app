package com.company.skills;

import com.company.Task;

public class AddNewTask extends Skill {
    public AddNewTask() {
        command = "-a";
        description = "Új feladatot ad hozzá";
    }

    @Override
    public void action(String[] args) {
        if (args.length < 2) {
            System.out.println("Nem lehetséges új feladat hozzáadása: nincs megadva a feladat!");
            return;
        }
        tasks.getTasks().add(new Task(args[1]));
        tasks.writeToDatabase();
        System.out.println("Feladat a listához adva");
    }
}
