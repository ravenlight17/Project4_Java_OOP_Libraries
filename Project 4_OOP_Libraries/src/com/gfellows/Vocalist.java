package com.gfellows;

public class Vocalist extends Artist {

    String influencedBy; // unique attribute for the com.gfellows.Vocalist Class


    //Super Constructor which connects the
    // parent class (com.gfellows.Artist) attributes & methods with the child class (com.gfellows.Vocalist)
    public Vocalist(String name, String country, String style, int timePeriod, String influencedBy) {
        super(name, country, style, timePeriod);
        this.influencedBy = influencedBy;
    }


}