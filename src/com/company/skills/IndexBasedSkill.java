package com.company.skills;

import com.company.Task;

public abstract class IndexBasedSkill extends Skill {
    protected Task getTask(String[] args) {
        int index;
        try {
            index = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nem lehetséges a feladat végrehajtása: nem adott meg indexet!");
            return null;
        } catch (NumberFormatException ex) {
            System.out.println("Nem lehetséges a feladat végrehajtása: a megadott index nem szám!");
            return null;
        }
        try {
            return tasks.getTasks().get(index);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nem lehetséges a feladat végrehajtása: túlindexelési probléma adódott!");
            return null;
        }
    }
}
