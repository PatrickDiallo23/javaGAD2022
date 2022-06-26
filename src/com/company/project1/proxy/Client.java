package com.company.project1.proxy;

public class Client {
//Accesezi un computer la o librarie, si vrei implementezi
// restrictii de acces catre anumite site-uri
//Implementeaza aceasta functionalitate folosing Proxy pattern

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("hello.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
