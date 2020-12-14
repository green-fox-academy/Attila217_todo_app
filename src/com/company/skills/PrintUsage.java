package com.company.skills;

public class PrintUsage extends Skill {
    public PrintUsage() {
        //doing nothing
    }

    @Override
    public void action(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Parancssori Todo applikáció\n");
        sb.append("=============================\n\n");
        sb.append("Parancssori argumentumok:\n");
        Skills skills = new Skills();
        for (Skill skill : skills.getCommandSkills()) {
            sb.append(skill);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
