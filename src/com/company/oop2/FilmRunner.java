package com.company.oop2;

public class FilmRunner {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("Oscar", 1990);
        Premiu oscar2000 = new Premiu("Oscar", 2000);
        Premiu oscar2010 = new Premiu("Oscar", 2010);
        Premiu oscar2018 = new Premiu("Oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu  oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("fara oscar", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("fara oscar", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("fara oscar", 20, new Premiu[]{});

        Film film1 = new Film("film cu actori de oscar", 1990, new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film("film cu actori fara premii 2", 2010, new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film("film cu actori fara premii 3", 2010, new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film("film cu actori de oscar", 2018, new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii01});
        Film film5 = new Film("film cu actori fara premii 5", 2018, new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("studio1", new Film[]{film1, film2});
        Studio studio2 = new Studio("studio2", new Film[]{film3, film4, film5});

        Studio[] studios = new Studio[]{studio1, studio2};
        for (Studio studio : studios) {
            if (studio.getFilms().length > 2) {
                System.out.println(studio.getName());
            }
        }

        for (Studio studio : studios) {
            for (Film film : studio.getFilms()) {
                for (Actor actor : film.getActori()) {
                    if (actor.getName().equals("actor cu 2 oscaruri")) {
                        System.out.println(studio.getName());
                    }
                }
            }
        }

        Film[] filmes = new Film[]{film1, film2, film3, film4, film5};
        for(Film film : filmes){
            for(Actor actor : film.getActori()){
                if(actor.getVarsta() > 50){
                    System.out.println(film.getName());
                }
            }
        }

    }
}
