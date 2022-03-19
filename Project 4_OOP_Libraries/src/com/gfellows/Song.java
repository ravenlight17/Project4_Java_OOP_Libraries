package com.gfellows;

public class Song {

    // com.gfellows.Song attributes:

    String title;
    Artist musician;
    String playlist;
    String url;

    //Constructor which initializes the attributes in the com.gfellows.Song class
    public Song(String title, Artist musician, String playlist, String url) {
        this.title = title;
        this.musician = musician;
        this.playlist = playlist;
        this.url = url;
    }

    // Allows us to print out an array without seeing the hashcode:
    //This method is overridden in order to return the values of the object which is showcased below:
    @Override
    public String toString() {
        return "\n-----------\nTitle: " + title + musician +
                "\nPlaylist: " + playlist +", Youtube URL: " + url;
    }

}


