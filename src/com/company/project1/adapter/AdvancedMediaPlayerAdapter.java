package com.company.project1.adapter;

class AdvancedMediaPlayerAdapter implements MediaPlayerInterface {
    //Presupunem ca avem o aplicatie in care utilizatorul vrea sa asculte fisierele din media
// Implementeaza aceasta functionalitate folosind AdapterPattern
    AdvancedMediaPlayerInterface advancedMusicPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayerInterface myMediaPlayer){
        advancedMusicPlayer = myMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMusicPlayer.loadFilename(filename);
        advancedMusicPlayer.listen();
    }
}
