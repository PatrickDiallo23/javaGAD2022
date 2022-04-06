package com.company.oop2;

import java.util.Random;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public Fighter getFighter1() {
        return fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public void fight() {
        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter1.getHealth() > 0) {
            System.out.println(fighter1.getName() + " wins!");
        }
        else {
            System.out.println(fighter2.getName() + " wins!");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();

        Fighter fighter1 = new Fighter("John", 100, random.nextInt(0,50));
        Fighter fighter2 = new Fighter("Mary", 100, random.nextInt(0,50));
        BoxingMatch match = new BoxingMatch(fighter1, fighter2);
        match.fight();
        System.out.println(fighter1.getName() + ": " + fighter1.getHealth());
        System.out.println(fighter2.getName() + ": " + fighter2.getHealth());
    }

}
