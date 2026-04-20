package org.example;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song.getTitle() + " added to playlist: " + name);
    }

    public void removeSongById(int id) {
        boolean found = false;

        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getId() == id) {
                System.out.println(songs.get(i).getTitle() + " removed from playlist: " + name);
                songs.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Song not found in playlist.");
        }
    }

    public void displayPlaylist() {
        System.out.println("\nPlaylist: " + name);

        if (songs.isEmpty()) {
            System.out.println("No songs in this playlist.");
            return;
        }

        for (Song song : songs) {
            song.display();
        }
    }
}