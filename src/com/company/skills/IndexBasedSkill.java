package com.company.skills;

import com.company.Task;

public abstract class IndexBasedSkill extends Skill {
    protected Task getTask(String[] args) {
        Task task = null;
        try {
            task = tasks.getTasks().get(Integer.parseInt(args[1]));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Nem lehetséges a feladat végrehajtása: nem adott meg indexet!");
        } catch (NumberFormatException ex) {
            System.out.println("Nem lehetséges a feladat végrehajtása: a megadott index nem szám!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Nem lehetséges a feladat végrehajtása: túlindexelési probléma adódott!");
        } finally {
            return task;
        }
    }
}
