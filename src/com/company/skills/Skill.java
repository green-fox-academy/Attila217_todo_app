package com.company.skills;

import com.company.Tasks;

public abstract class Skill {
    protected String command;
    protected String description;
    protected Tasks tasks;

    public String getCommand() {
        return command;
    }

    public Skill load() {
        this.tasks = new Tasks();
        return this;
    }

    public abstract void action(String[] args);

    @Override
    public String toString() {
        return command + "   " + description;
    }
}
