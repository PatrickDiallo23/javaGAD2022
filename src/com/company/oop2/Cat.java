package com.company.oop2;

public class Cat extends Animal implements Pet {
    private String name;


    public Cat(String name) {
        super(4);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat play");
    }


    public Cat(){
        super(4);
        this.name ="";
    }


    @Override
    public void walk() {
        System.out.println("Cat walk");
    }
    @Override
    public void eat() {
        System.out.println("Cat eat");
    }
}
