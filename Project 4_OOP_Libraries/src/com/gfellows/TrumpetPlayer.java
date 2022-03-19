package com.gfellows;

public class TrumpetPlayer extends Artist {

    String trumpetType; // unique attribute for the com.gfellows.TrumpetPlayer Class


    //Super Constructor which connects the
    // parent class (com.gfellows.Artist) attributes & methods with the child class (com.gfellows.TrumpetPlayer):
    public TrumpetPlayer(String name, String country, String style, int timePeriod, String trumpetType) {
        super(name, country, style, timePeriod);
        this.trumpetType = trumpetType;
    }
}