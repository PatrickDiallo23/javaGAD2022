package com.company.project1.adapter;

public class Client {
//Presupunem ca avem o aplicatie in care utilizatorul vrea sa asculte fisierele din media
// Implementeaza aceasta functionalitate folosind AdapterPattern

    public static void main(String[] args) {
        MediaPlayerInterface audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3" , "justin.mp3");

        AdvancedMediaPlayerInterface mp4Player = new Mp4Player();
        MediaPlayerInterface advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "who.mp4");

        AdvancedMediaPlayerInterface vlcPlayer = new VlcPlayer();
        MediaPlayerInterface advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "inna.vlc");

        audioPlayer.play("vlc" , "inna.vlc");
    }


}
