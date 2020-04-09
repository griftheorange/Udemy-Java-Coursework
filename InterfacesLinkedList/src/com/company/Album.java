package com.company;

import java.util.ArrayList;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album(String title) {
        this.songs = new ArrayList<Song>();
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void addSong(String songName, double songDuration){
        addSong(new Song(songName, songDuration));
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
