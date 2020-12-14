package com.company.skills;

public class PrintAllTasks extends Skill {
    public PrintAllTasks() {
        command = "-l";
        description = "Kilistázza a feladatokat";
    }

    @Override
    public void action(String[] args) {
        if (tasks.getTasks().size() == 0) {
            System.out.println("Nincs mára tennivalód! :)");
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tasks.getTasks().size(); i++) {
                sb.append(i + 1);
                sb.append(" - ");
                sb.append(tasks.getTasks().get(i));
                sb.append(System.lineSeparator());
            }
            System.out.println(sb);
        }
    }
}
