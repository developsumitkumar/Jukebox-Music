package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JukeboxService {

    private ArrayList<Song> songs;
    private ArrayList<Podcast> podcasts;
    private ArrayList<Playlist> playlists;
    private AudioPlayer audioPlayer;
    private Scanner scanner;

    public JukeboxService() {
        songs = SampleData.loadSongs();
        podcasts = SampleData.loadPodcasts();
        playlists = new ArrayList<>();
        audioPlayer = new AudioPlayer();
        scanner = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n========== JUKEBOX APPLICATION ==========");
            System.out.println("1. View All Songs");
            System.out.println("2. Browse Songs");
            System.out.println("3. Search Songs Alphabetically");
            System.out.println("4. Play Song");
            System.out.println("5. View All Podcasts");
            System.out.println("6. Play Podcast");
            System.out.println("7. Playlist Management");
            System.out.println("8. Pause Audio");
            System.out.println("9. Resume Audio");
            System.out.println("10. Stop Audio");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    viewAllSongs();
                    break;
                case 2:
                    browseSongsMenu();
                    break;
                case 3:
                    searchSongsAlphabetically();
                    break;
                case 4:
                    playSongById();
                    break;
                case 5:
                    viewAllPodcasts();
                    break;
                case 6:
                    playPodcastById();
                    break;
                case 7:
                    playlistMenu();
                    break;
                case 8:
                    audioPlayer.pause();
                    break;
                case 9:
                    audioPlayer.resume();
                    break;
                case 10:
                    audioPlayer.stop();
                    break;
                case 0:
                    audioPlayer.stop();
                    System.out.println("Exiting Jukebox Application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid number.");
            }

        } while (choice != 0);
    }

    private void viewAllSongs() {
        System.out.println("\n----- ALL SONGS -----");

        if (songs.isEmpty()) {
            System.out.println("No songs available.");
            return;
        }

        for (Song song : songs) {
            song.display();
        }
    }

    private void browseSongsMenu() {
        int choice;

        do {
            System.out.println("\n----- BROWSE SONGS -----");
            System.out.println("1. Browse by Artist");
            System.out.println("2. Browse by Album");
            System.out.println("3. Browse by Genre");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    browseByArtist();
                    break;
                case 2:
                    browseByAlbum();
                    break;
                case 3:
                    browseByGenre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    private void browseByArtist() {
        System.out.print("Enter artist name: ");
        String artist = scanner.nextLine().trim().toLowerCase();

        boolean found = false;

        for (Song song : songs) {
            if (song.getArtist().toLowerCase().contains(artist)) {
                song.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No songs found for this artist.");
        }
    }

    private void browseByAlbum() {
        System.out.print("Enter album name: ");
        String album = scanner.nextLine().trim().toLowerCase();

        boolean found = false;

        for (Song song : songs) {
            if (song.getAlbum().toLowerCase().contains(album)) {
                song.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No songs found for this album.");
        }
    }

    private void browseByGenre() {
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine().trim().toLowerCase();

        boolean found = false;

        for (Song song : songs) {
            if (song.getGenre().toLowerCase().contains(genre)) {
                song.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No songs found for this genre.");
        }
    }

    private void searchSongsAlphabetically() {
        System.out.print("Enter first letter of song title: ");
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Please enter a valid letter.");
            return;
        }

        char letter = Character.toLowerCase(input.charAt(0));
        boolean found = false;

        ArrayList<Song> sortedSongs = new ArrayList<>(songs);
        Collections.sort(sortedSongs, Comparator.comparing(Song::getTitle));

        for (Song song : sortedSongs) {
            if (Character.toLowerCase(song.getTitle().charAt(0)) == letter) {
                song.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No songs found starting with that letter.");
        }
    }

    private void playSongById() {
        viewAllSongs();
        System.out.print("Enter Song ID to play: ");
        int id = readInt();

        if (id == -1) {
            System.out.println("Please enter a valid number.");
            return;
        }

        Song song = findSongById(id);

        if (song != null) {
            audioPlayer.play(song.getFilePath());
        } else {
            System.out.println("Song not found.");
        }
    }

    private void viewAllPodcasts() {
        System.out.println("\n----- ALL PODCASTS -----");

        if (podcasts.isEmpty()) {
            System.out.println("No podcasts available.");
            return;
        }

        for (Podcast podcast : podcasts) {
            podcast.display();
        }
    }

    private void playPodcastById() {
        viewAllPodcasts();
        System.out.print("Enter Podcast ID to play: ");
        int id = readInt();

        if (id == -1) {
            System.out.println("Please enter a valid number.");
            return;
        }

        Podcast podcast = findPodcastById(id);

        if (podcast != null) {
            audioPlayer.play(podcast.getFilePath());
        } else {
            System.out.println("Podcast not found.");
        }
    }

    private void playlistMenu() {
        int choice;

        do {
            System.out.println("\n----- PLAYLIST MANAGEMENT -----");
            System.out.println("1. Create Playlist");
            System.out.println("2. View All Playlists");
            System.out.println("3. Add Song to Playlist");
            System.out.println("4. Remove Song from Playlist");
            System.out.println("5. View Songs in Playlist");
            System.out.println("6. Play Song from Playlist");
            System.out.println("0. Back");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    createPlaylist();
                    break;
                case 2:
                    viewAllPlaylists();
                    break;
                case 3:
                    addSongToPlaylist();
                    break;
                case 4:
                    removeSongFromPlaylist();
                    break;
                case 5:
                    viewSongsInPlaylist();
                    break;
                case 6:
                    playSongFromPlaylist();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    private void createPlaylist() {
        System.out.print("Enter playlist name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Playlist name cannot be empty.");
            return;
        }

        Playlist playlist = new Playlist(name);
        playlists.add(playlist);

        System.out.println("Playlist created successfully.");
    }

    private void viewAllPlaylists() {
        System.out.println("\n----- ALL PLAYLISTS -----");

        if (playlists.isEmpty()) {
            System.out.println("No playlists created yet.");
            return;
        }

        for (int i = 0; i < playlists.size(); i++) {
            System.out.println((i + 1) + ". " + playlists.get(i).getName());
        }
    }

    private void addSongToPlaylist() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available. Create one first.");
            return;
        }

        viewAllPlaylists();
        System.out.print("Select playlist number: ");
        int playlistNumber = readInt();

        if (playlistNumber < 1 || playlistNumber > playlists.size()) {
            System.out.println("Invalid playlist number.");
            return;
        }

        viewAllSongs();
        System.out.print("Enter Song ID to add: ");
        int songId = readInt();

        if (songId == -1) {
            System.out.println("Please enter a valid number.");
            return;
        }

        Song song = findSongById(songId);

        if (song != null) {
            playlists.get(playlistNumber - 1).addSong(song);
        } else {
            System.out.println("Song not found.");
        }
    }

    private void removeSongFromPlaylist() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available.");
            return;
        }

        viewAllPlaylists();
        System.out.print("Select playlist number: ");
        int playlistNumber = readInt();

        if (playlistNumber < 1 || playlistNumber > playlists.size()) {
            System.out.println("Invalid playlist number.");
            return;
        }

        Playlist playlist = playlists.get(playlistNumber - 1);
        playlist.displayPlaylist();

        System.out.print("Enter Song ID to remove: ");
        int songId = readInt();

        if (songId == -1) {
            System.out.println("Please enter a valid number.");
            return;
        }

        playlist.removeSongById(songId);
    }

    private void viewSongsInPlaylist() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available.");
            return;
        }

        viewAllPlaylists();
        System.out.print("Select playlist number: ");
        int playlistNumber = readInt();

        if (playlistNumber < 1 || playlistNumber > playlists.size()) {
            System.out.println("Invalid playlist number.");
            return;
        }

        playlists.get(playlistNumber - 1).displayPlaylist();
    }

    private void playSongFromPlaylist() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available.");
            return;
        }

        viewAllPlaylists();
        System.out.print("Select playlist number: ");
        int playlistNumber = readInt();

        if (playlistNumber < 1 || playlistNumber > playlists.size()) {
            System.out.println("Invalid playlist number.");
            return;
        }

        Playlist playlist = playlists.get(playlistNumber - 1);

        if (playlist.getSongs().isEmpty()) {
            System.out.println("This playlist is empty.");
            return;
        }

        playlist.displayPlaylist();
        System.out.print("Enter Song ID from playlist to play: ");
        int songId = readInt();

        if (songId == -1) {
            System.out.println("Please enter a valid number.");
            return;
        }

        for (Song song : playlist.getSongs()) {
            if (song.getId() == songId) {
                audioPlayer.play(song.getFilePath());
                return;
            }
        }

        System.out.println("Song not found in playlist.");
    }

    private Song findSongById(int id) {
        for (Song song : songs) {
            if (song.getId() == id) {
                return song;
            }
        }
        return null;
    }

    private Podcast findPodcastById(int id) {
        for (Podcast podcast : podcasts) {
            if (podcast.getId() == id) {
                return podcast;
            }
        }
        return null;
    }

    private int readInt() {
        String input = scanner.nextLine().trim();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}