package com.company.oop2;

public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        System.out.println(d.getName());
        d.play();
        c.walk();
        c.play();
        a.eat();
        a.walk();
        e.eat();
        e.walk();
        p.setName("Barsik");
        System.out.println(p.getName());
        p.play();



    }
}
