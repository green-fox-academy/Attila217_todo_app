package com.company.skills;

import com.company.Task;

public class RemoveTask extends IndexBasedSkill {
    public RemoveTask() {
        command = "-r";
        description = "Eltávolít egy feladatot";
    }

    @Override
    public void action(String[] args) {
        Task task = this.getTask(args);
        if (task == null) return;
        tasks.getTasks().remove(task);
        tasks.writeToDatabase();
        System.out.println("Feladat törölve");
    }
}
