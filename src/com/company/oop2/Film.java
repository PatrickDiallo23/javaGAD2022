package com.company.oop2;

public class Film {
    private String name;
    private int anAparitie;
    private Actor[] actori;

    public Film(String name, int anAparitie, Actor[] actori) {
        this.name = name;
        this.anAparitie = anAparitie;
        this.actori = actori;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
}
