package com.gfellows;

public class Artist {

    // com.gfellows.Artist attributes:

    String name;
    String country;
    String style;
    int timePeriod;


    // constructor which initializes the attributes in the com.gfellows.Artist class

    public Artist(String name, String country, String style, int timePeriod) {
        this.name = name;
        this.country = country;
        this.style = style;
        this.timePeriod = timePeriod;
    }


    // Allows us to print out an array without seeing the hash code:
    // This method is overridden in order to return the values of the objects which is showcased below:

    @Override
    public String toString() {
        return  " \nName: " + name +
                ", Country: " + country +
                ", Style: " + style +
                ", Time Period: " + timePeriod;

    }


}
