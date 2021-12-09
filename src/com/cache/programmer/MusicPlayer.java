package com.cache.programmer;

interface MusicSystemInterface{
    void playSong(String str);

}


public class MusicPlayer {

    public static void main(String[] args) {
        MusicSystemInterface musicSystemInterface = str-> System.out.println("Playing Song: "+ str);
        musicSystemInterface.playSong("Heart wants what it wants");
    }



}
