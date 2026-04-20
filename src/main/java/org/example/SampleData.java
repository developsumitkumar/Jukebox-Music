package org.example;

import java.util.ArrayList;

public class SampleData {

    public static ArrayList<Song> loadSongs() {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Amplifier", "Imran Khan", "Unforgettable", "Pop", "songs/AMPLIFIER.wav"));
        songs.add(new Song(2, "Boyfriend", "Justin Bieber", "Believe", "Pop", "songs/BOYFRIEND.wav"));
        songs.add(new Song(3, "Dealer", "Unknown", "Unknown", "HipHop", "songs/DEALER.wav"));
        songs.add(new Song(4, "Divine", "Divine", "Street Dreams", "Rap", "songs/DIVINE.wav"));
        songs.add(new Song(5, "For A Reason", "Unknown", "Unknown", "Pop", "songs/FOR_A_REASON.wav"));
        songs.add(new Song(6, "Goat", "Diljit Dosanjh", "GOAT", "Punjabi", "songs/GOAT.wav"));
        songs.add(new Song(7, "High Heels", "Yo Yo Honey Singh", "Unknown", "Party", "songs/HIGH_HEELS.wav"));
        songs.add(new Song(8, "In The End", "Linkin Park", "Hybrid Theory", "Rock", "songs/IN_THE_END.wav"));
        songs.add(new Song(9, "Khairiyat", "Arijit Singh", "Chhichhore", "Romance", "songs/KHAIRIYAT.wav"));
        songs.add(new Song(10, "Lonely", "Akon", "Trouble", "Pop", "songs/LONELY.wav"));
        songs.add(new Song(11, "Loose Yourself", "Eminem", "Curtain Call", "Rap", "songs/LOOSE_YOURSELF.wav"));
        songs.add(new Song(12, "Lover", "Diljit Dosanjh", "Unknown", "Punjabi", "songs/LOVER.wav"));
        songs.add(new Song(13, "Numb", "Linkin Park", "Meteora", "Rock", "songs/NUMB.wav"));
        songs.add(new Song(14, "Shape Of You", "Ed Sheeran", "Divide", "Pop", "songs/SHAPE_OF_YOU.wav"));
        songs.add(new Song(15, "Tere Hawale", "Arijit Singh", "Laal Singh Chaddha", "Romance", "songs/TERE_HAWALE.wav"));
        songs.add(new Song(16, "The Last Ride", "Sidhu Moosewala", "Unknown", "Punjabi", "songs/THE_LAST_RIDE.wav"));
        songs.add(new Song(17, "Tum Hi Ho", "Arijit Singh", "Aashiqui 2", "Romance", "songs/TUM_HI_HO.wav"));
        songs.add(new Song(18, "Waka Waka", "Shakira", "World Cup", "Pop", "songs/WAKA_WAKA.wav"));
        songs.add(new Song(19, "Zaalima", "Arijit Singh", "Raees", "Romance", "songs/ZAALIMA.wav"));

        return songs;
    }

    public static ArrayList<Podcast> loadPodcasts() {
        ArrayList<Podcast> podcasts = new ArrayList<>();

        podcasts.add(new Podcast(1, "Startup Talk", "Rahul Jain", "Business", "podcasts/podcast1.wav"));
        podcasts.add(new Podcast(2, "Health Matters", "Dr. Mehta", "Health", "podcasts/podcast2.wav"));

        return podcasts;
    }
}