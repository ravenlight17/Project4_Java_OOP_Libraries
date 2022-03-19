package com.gfellows;

import java.util.ArrayList;

public class Library {

    //com.gfellows.Library attribute:
    private ArrayList<Song> album;

    //Constructor initialized for this class:
    public Library() {
        this.album = new ArrayList<>();
    }



    //This method iterates through the array:
    public String getSongs() {

        System.out.println("\n Here is your playlist: ");


        String songs = "";

        for (Song playlist : this.album) {
            //Adding += allows the loop to go through the entire array instead of
            // just the last array entry
            songs += playlist.toString() + "\n";

        }
        return songs;
    }

    //Created a method which allows us to add a com.gfellows.Song to the ArrayList
    public void addSong(Song song) {
        album.add(song);
    }

    //Created a method which allows us to get the size of the ArrayList for quality control:
    public int getSize() {
        return album.size();
    }


}