package com.company.project1.proxy;

import java.util.*;

public class ProxyInternet implements Internet{
    //Accesezi un computer la o librarie, si vrei implementezi
// restrictii de acces catre anumite site-uri
//Implementeaza aceasta functionalitate folosing Proxy pattern
    private Internet internet = new RealInternet();

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("altceva.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("whatever.com");
        bannedSites.add("hello.com");

    }

    @Override
    public void connectTo(String serverhost) throws Exception{
        if(bannedSites.contains(serverhost.toLowerCase())){
            throw new Exception("Acces Denied!!");
        }

        internet.connectTo(serverhost);
    }

}
