package com.company.project1.adapter;

public interface MediaPlayerInterface {

    void play(String audioType, String filename);
}

 class AudioPlayer implements  MediaPlayerInterface{
     //Presupunem ca avem o aplicatie in care utilizatorul vrea sa asculte fisierele din media
// Implementeaza aceasta functionalitate folosind AdapterPattern
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + filename);
        }
        else{
            System.out.println("Invalid media. " + audioType + " format not supported...");
        }
    }
}
