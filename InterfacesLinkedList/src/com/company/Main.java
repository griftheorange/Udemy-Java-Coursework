package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<Album>();
        Album yeet = new Album("Yeet");
        Album yote = new Album("Yote");

        yeet.addSong("Yeetus", 30D);
        yeet.addSong("Lollipop", 60.0D);

        yote.addSong("Yote the Police", 1D);
        yote.addSong("Feet Slap", 120D);
        yote.addSong("Yeet", 2D);

        Playlist playlist = new Playlist("Songs I yeet to");
        playlist.addSong(yeet, "Yeetus");
        playlist.addSong(yote, "Yote the Police");
        playlist.addSong(yote, "Yeet");

        playlist.startPlaylist(scanner);
    }
}
