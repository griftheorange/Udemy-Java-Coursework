package com.company;

import java.util.*;

public class Playlist {
    private String title;
    private LinkedList<Song> songs;

    public Playlist(String title) {
        this.songs = new LinkedList<Song>();
    }

    public void startPlaylist(Scanner scanner){
        System.out.println(String.format("You have started %s", this.title));

        ListIterator<Song> songListIterator = this.songs.listIterator();
        Song song = songListIterator.next();
        boolean goingForward = true;
        while(true){
            printMenu();
            System.out.println(String.format("Playing %1$s: %2$s minutes", song.getTitle(), song.getDuration()));
            int num = 0;
            boolean err = false;
            while(true){
                if(scanner.hasNextInt()){
                    num = scanner.nextInt();
                }
                scanner.nextLine();
                if(num > 0 && num <= 6){
                    break;
                } else {
                    System.out.println("Please input a number in the valid range");
                }
            }
            switch(num){
                case 1:
                    return;
                case 2:
                    if(!goingForward){
                        songListIterator.next();
                    }
                    goingForward = true;
                    if(songListIterator.hasNext()){
                        song = songListIterator.next();
                    } else {
                        System.out.println("At the end of the songs");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    if(goingForward){
                        songListIterator.previous();
                    }
                    goingForward = false;
                    if(songListIterator.hasPrevious()){
                        song = songListIterator.previous();
                    } else {
                        System.out.println("At the start of the playlist");
                    }
                    break;
                case 5:
                    printSongList();
                    break;
                case 6:
                    if(removeSongPrompt(scanner)){
                        if(songListIterator.hasNext() || songListIterator.hasPrevious()){
                            songListIterator = songs.listIterator();
                            song = songListIterator.next();
                        } else {
                            System.out.println("No more songs in the playlist");
                            return;
                        }
                    };
                    break;

            }
        }
    }

    public void printSongList(){
        System.out.println("Songs:");
        ListIterator<Song> iterator = songs.listIterator();
        while(iterator.hasNext()){
            Song song = iterator.next();
            System.out.println(String.format("%1$s: %2$s minutes", song.getTitle(), song.getDuration()));
        }
        System.out.println();
    }

    public void printMenu(){
        System.out.println();
        System.out.println("Menu Options:");
        System.out.println("1. Quit");
        System.out.println("2. Next Song");
        System.out.println("3. Replay Song");
        System.out.println("4. Previous Song");
        System.out.println("5. List Songs");
        System.out.println("6. Remove Song");
        System.out.println();
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void addSong(Album album, String songName){
        ArrayList<Song> songs = album.getSongs();
        Iterator<Song> songIterator = songs.iterator();
        while(songIterator.hasNext()){
            Song song = songIterator.next();
            if(song.getTitle().equals(songName)){
                addSong(song);
            }
        }
        System.out.println(String.format("There was no song in %1$s matching %2$s", album.getTitle(), songName));
    }

    private boolean removeSongPrompt(Scanner scanner){
        System.out.println("Enter the name of the song you wish to remove:");
        String name = scanner.nextLine();
        return removeSong(name);
    }

    private boolean removeSong(String songName){
        int index = this.songIndex(songName);
        if(index >= 0){
            songs.remove(index);
            return true;
        } else {
            System.out.println("There is no song with that name in this playlist");
            return false;
        }
    }

    private int songIndex(String songName){
        ListIterator<Song> iterator = this.songs.listIterator();
        int count = 0;
        while(iterator.hasNext()){
            Song song = iterator.next();
            if(song.getTitle().equals(songName)){
                return count;
            }
            count++;
        }
        return -1;
    }
}
