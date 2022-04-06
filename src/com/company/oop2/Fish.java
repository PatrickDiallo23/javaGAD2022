package com.company.oop2;

public class Fish extends Animal implements Pet {


    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk");
    }

    @Override
    public void eat() {
        System.out.println("Fish eats");
    }

    @Override
    public String getName() {
        return "Fish";
    }

    @Override
    public void setName(String name) {
        System.out.println("NUme ales");
    }

    @Override
    public void play() {
        System.out.println("Fish swims");
    }
}
