package com.gfellows;

public class Guitarist extends Artist {

    double numStrings; // unique attribute for the com.gfellows.Guitarist class


    //Super Constructor which connects the
    // parent class (com.gfellows.Artist) attributes & methods with the child class (com.gfellows.Guitarist):
    public Guitarist(String name, String country, String style, int timePeriod, int numStrings) {
        super(name, country, style, timePeriod);
        this.numStrings = numStrings;
    }


}
