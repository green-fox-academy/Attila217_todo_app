package com.company.skills;

public class RemoveTask extends IndexBasedSkill {
    public RemoveTask() {
        command = "-r";
        description = "Eltávolít egy feladatot";
    }

    @Override
    public void action(String[] args) {

    }
}
