package com.company.oop2;

public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

   public abstract void walk();
    public abstract void eat();
}
