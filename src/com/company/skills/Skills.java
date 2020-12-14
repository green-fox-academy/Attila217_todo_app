package com.company.skills;

import java.util.ArrayList;

public class Skills {
    private ArrayList<Skill> allSkills = new ArrayList<>();
    private ArrayList<Skill> commandSkills = new ArrayList<>();

    public Skills() {
        allSkills.add(new PrintUsage());
        commandSkills.add(new PrintAllTasks());
        commandSkills.add(new AddNewTask());
        commandSkills.add(new RemoveTask());
        commandSkills.add(new CheckTask());
        allSkills.addAll(commandSkills);
    }

    public ArrayList<Skill> getCommandSkills() {
        return commandSkills;
    }

    public Skill getSkillToRun(String[] args) throws UnsupportedOperationException {
        if (args.length == 0) {
            return allSkills.get(0).load();
        }
        for (Skill skill : commandSkills) {
            if (args[0].equals(skill.getCommand())) {
                return skill.load();
            }
        }
        throw new UnsupportedOperationException("Nem támogatott argumentum!");
    }
}
