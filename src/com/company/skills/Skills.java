package com.company.skills;

import java.util.ArrayList;

public class Skills {
    private final ArrayList<Skill> commandSkills = new ArrayList<>();

    public Skills() {
        commandSkills.add(new PrintAllTasks());
        commandSkills.add(new AddNewTask());
        commandSkills.add(new RemoveTask());
        commandSkills.add(new CheckTask());
    }

    public ArrayList<Skill> getCommandSkills() {
        return commandSkills;
    }

    public Skill getSkillToRun(String[] args) throws UnsupportedOperationException {
        if (args.length == 0) {
            PrintUsage printUsage = new PrintUsage();
            return printUsage.load();
        }
        for (Skill skill : commandSkills) {
            if (args[0].equals(skill.getCommand())) {
                return skill.load();
            }
        }
        throw new UnsupportedOperationException("Nem támogatott argumentum!");
    }
}
