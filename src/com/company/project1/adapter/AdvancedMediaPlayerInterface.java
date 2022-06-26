package com.company.project1.adapter;

public interface AdvancedMediaPlayerInterface {
    //Presupunem ca avem o aplicatie in care utilizatorul vrea sa asculte fisierele din media
// Implementeaza aceasta functionalitate folosind AdapterPattern
    void loadFilename(String fileName);
    void listen();
}

 class VlcPlayer implements AdvancedMediaPlayerInterface{
    String myFile;

    @Override
    public void loadFilename(String fileName) {
        myFile = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: "+ myFile);
    }
}

class Mp4Player implements AdvancedMediaPlayerInterface{
    String myFile;

    @Override
    public void loadFilename(String fileName) {
myFile = fileName;
    }

    @Override
    public void listen() {
System.out.println("Playing mp4 file. Name: "+ myFile);
    }
}