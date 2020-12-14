package com.company.skills;

import com.company.Task;

public class CheckTask extends IndexBasedSkill {
    public CheckTask() {
        command = "-c";
        description = "Teljesít egy feladatot";
    }

    @Override
    public void action(String[] args) {
        Task task = this.getTask(args);
        if (task == null) return;
        task.setDoneToTrue();
        tasks.writeToDatabase();
        System.out.println("Feladat teljesítve");
    }
}
