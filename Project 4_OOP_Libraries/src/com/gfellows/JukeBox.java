package com.gfellows;

public class JukeBox {

    public static void main(String[] args) {


        // Created Musicians we want in our library

        Artist Freddie = new TrumpetPlayer("Freddie Hubbard", "USA", "Jazz",
                1971, "Flugelhorn");
        Artist Joe = new Guitarist("Joe Pass", "USA", "Jazz", 1976, 6);
        Artist Ella = new Vocalist("Ella Fitzgerld", "USA", "Jazz", 1957,
                "Duke Ellington");
        Artist Cleo = new Vocalist("Cleo Sol", "USA", "R&B/Soul", 2007,
                "Stevie Wonder");
        Artist jimi = new Guitarist("Jimi Hendrix", "US",
                "Rock", 1960, 150);
        Artist dizzy = new TrumpetPlayer("Dizzy Gillespie", "USA",
                "Jazz", 1951, "King B-Flat Trumpet");

        // Created Songs we want in our library

        Song song = new Song("First Light", Freddie, "Chill",
                "https://www.youtube.com/watch?v=NwvxiBEPDdA");
        Song song1 = new Song("Ain't Misbehavin'", Joe, "Exciting",
                "https://www.youtube.com/watch?v=p_kUJa1PueM");
        Song song2 = new Song("Good Bye Rodney", Ella, "Smooth",
                "https://www.youtube.com/watch?v=sJCB28s0Pc8&list=RDvrfXCnIBirE&start_radio=1");
        Song song3 = new Song("Rose in the Dark", Cleo, "Chill",
                "https://www.youtube.com/results?search_query=rose+in+the+dark+cleo+sol");
        Song song4 = new Song("All Along the WatchTower", jimi, "Meditative",
                "https://www.youtube.com/watch?v=TLV4_xaYynY&ab_channel=JimiHendrixVEVO");
        Song song5 = new Song("Salt Peanuts", dizzy, "Sassy",
                "https://www.youtube.com/watch?v=TvIXzeDLpMw&ab_channel=GordonHudson");

        //  Created an ArrayList object
        //  which would allow us to add music to the ArrayList:

        Library lib = new Library();
        lib.addSong(song);
        lib.addSong(song1);
        lib.addSong(song2);
        lib.addSong(song3);
        lib.addSong(song4);
        lib.addSong(song5);


        // Allows us to iterate through the ArrayList
        // and print out the results:

        System.out.println(lib.getSongs());




    }

}
