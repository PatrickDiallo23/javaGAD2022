package com.company.project1;

public class Captain {
//Presupunem ca sunt un membru al unei echipe de fotbal
//si particip cu echipa la un meci impotriva altei echipe
//la inceputul meciului capitanii se duc la centru sa se targuiasca cu arbitrul
//pentru a se decide cine are lovitura de start
//Capitanii se aleg mereu inainte de inceperea meciului
// o echipa nu poate avea 2 capitani in acelasi timp pe tereni
// Folosind Singleton Pattern putem sa ne asiguram ca nu avem mai multi de 2 capitani intr-o echipa
    private Captain(){}

    private static class SingletonHelper {
        private static final Captain _captain = new Captain();

    }
        public static Captain getCaptain(){
            return SingletonHelper._captain;
        }


    public static void main(String[] args) {
        System.out.println("Singleton Patter Demo");
        System.out.println("Making a captain for our team");

        Captain c1 = Captain.getCaptain();

        System.out.println("Making a captain for our team");

        Captain c2 = Captain.getCaptain();

        if(c1 == c2)
            System.out.println("c1 and c2 are the same instance");

    }
}
