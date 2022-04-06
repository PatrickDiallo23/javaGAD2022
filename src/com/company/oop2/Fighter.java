package com.company.oop2;

public class Fighter {
    private String name;
    private int health;
    private int damage;

    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String toString() {
        return "Name: " + name + ", Health: " + health + ", Damage: " + damage;
    }

    public void attack(Fighter fighter2) {
        fighter2.setHealth(fighter2.getHealth() - damage);
    }
}
