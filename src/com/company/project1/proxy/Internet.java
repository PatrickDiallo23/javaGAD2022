package com.company.project1.proxy;

interface Internet {
    //Accesezi un computer la o librarie, si vrei implementezi
// restrictii de acces catre anumite site-uri
//Implementeaza aceasta functionalitate folosing Proxy pattern
    public void connectTo(String serverhost) throws Exception;
}

class RealInternet implements Internet{
    @Override
    public void connectTo(String serverhost){
        System.out.println("Connecting to... " + serverhost);
    }
}
