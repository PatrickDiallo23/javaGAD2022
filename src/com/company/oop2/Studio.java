package com.company.oop2;

public class Studio {
    private String name;
    private Film[] films;

    public Studio(String name, Film[] films) {
        this.name = name;
        this.films = films;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Film[] getFilms() {
        return films;
    }
    public void setFilms(Film[] films) {
        this.films = films;
    }
}
