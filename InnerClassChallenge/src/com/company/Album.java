package com.company;

import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
    private String title;
    private SongList songs;

    private class SongList {
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<Song>();
        }

        private void add(Song song){
            songs.add(song);
        }

        private Song findSong(String title){
            ListIterator<Song> iterator = songs.listIterator();
            while(iterator.hasNext()){
                Song next = iterator.next();
                if(next.getTitle() == title){
                    return next;
                }
            }
            return null;
        }

        private ArrayList<Song> getArrList(){
            return songs;
        }
    }

    public Album(String title) {
        this.songs = new SongList();
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void addSong(String songName, double songDuration){
        if(songs.findSong(songName) == null){
            addSong(new Song(songName, songDuration));
        } else {
            System.out.println("A song of that name already exists");
        }
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs.getArrList();
    }
}
