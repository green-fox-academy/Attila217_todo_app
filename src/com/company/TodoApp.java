package com.company;

import com.company.skills.Skill;
import com.company.skills.Skills;

public class TodoApp {

    public static void main(String[] args) {
        if (args.length > 2) {
            System.out.println("túl sok argumentum");
            return;
        }
        Skills skills = new Skills();
        Skill skillToRun = null;
        try {
            skillToRun = skills.getSkillToRun(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
        skillToRun.action(args);
    }
}
