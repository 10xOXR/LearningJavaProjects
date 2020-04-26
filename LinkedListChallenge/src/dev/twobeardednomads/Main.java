package dev.twobeardednomads;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Song> playList = new LinkedList<>();

    public static void main(String[] args) {
        listMenuOptions();
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter choice (7 for menu options): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Quiting...");
                    quit = true;
                    break;
                case 1:
                    createAlbum();
                    break;
                case 2:
                    listAlbumsWithTracks();
                    break;
                case 3:
                    addPlaylistSong();
                    break;
                case 4:
                    removePlaylistSong();
                    break;
                case 5:
                    listPlaylistSongs();
                    break;
                case 6:
                    beginPlayback();
                    break;
                case 7:
                    listMenuOptions();
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    private static void listMenuOptions() {
        System.out.println("Please select an option: ");
        System.out.println("\t0 - Quit application.\n" +
                "\t1 - Create an album.\n" +
                "\t2 - List all albums + tracks.\n" +
                "\t3 - Add song to playlist.\n" +
                "\t4 - Remove song from playlist.\n" +
                "\t5 - List songs in playlist.\n" +
                "\t6 - Play the playlist.\n" +
                "\t7 - Display options menu.");
    }

    private static void playListOptions() {
        System.out.println("S (Stop Playback), D (Delete Track)  P (Previous Track), N (Next Track), R (Repeat Current Track)");
    }

    private static void createAlbum() {
        System.out.print("Enter album name: ");
        String albumName = scanner.nextLine();
        ArrayList<Song> albumSongs = new ArrayList<>();
        boolean addNewSong = true;
        int trackCounter = 1;
        while (addNewSong) {
            System.out.print("Enter Track " + trackCounter + " name: ");
            String songName = scanner.nextLine();
            System.out.print("Enter track duration: ");
            String songDuration = scanner.nextLine();
            albumSongs.add(new Song(songName, songDuration));

            boolean addMoreTracksMessage = true;
            while (addMoreTracksMessage) {
                System.out.print("Add more tracks? (Y/N): ");
                String choice = scanner.nextLine().toLowerCase();
                switch (choice) {
                    case "y":
                        trackCounter++;
                        addMoreTracksMessage = false;
                        break;
                    case "n":
                        addNewSong = false;
                        addMoreTracksMessage = false;
                        break;
                    default:
                        System.out.println("Invalid choice.\n");
                }
            }
        }
        albums.add(new Album(albumName, albumSongs));
        System.out.println("Album added successfully\n");
    }

    private static void listAlbumsWithTracks() {
        if (albums.size() == 0) {
            System.out.println("There are no albums in your collection.\n");
        } else for (int i = 0; i < albums.size(); i++) {
            System.out.println("Album " + (i + 1) + ": " + albums.get(i).getAlbumTitle());
            ArrayList<Song> songs = albums.get(i).getAlbumSongs();
            for (int j = 0; j < songs.size(); j++) {
                System.out.print("\tTrack " + (j + 1) + ": " + songs.get(j).getSongName() + " (" + songs.get(j).getSongDuration() + ")\n");
            }
            System.out.println();
        }
    }

    private static void addPlaylistSong() {
        System.out.print("Enter album name: ");
        String albumName = scanner.nextLine();
        Album selectedAlbum = Album.queryAlbum(albumName, albums);
        if (selectedAlbum == null) {
            System.out.println("Album not found.");
        } else {
            System.out.print("Enter track name: ");
            String trackName = scanner.nextLine();
            Song song = Song.querySong(trackName, selectedAlbum.getAlbumSongs());
            if (song == null) {
                System.out.println("Song \"" + trackName + "\" was not found on the album.\n");
            } else {
                playList.add(song);
                System.out.println("\"" + song.getSongName() + "\" added to playlist.\n");
            }
        }
    }

    private static void removePlaylistSong() {
        System.out.print("Enter track name to remove: ");
        String removeTrackName = scanner.nextLine();
        int position = findSong(removeTrackName);
        if (position >= 0) {
            playList.remove(position);
            System.out.println("Track removed from playlist.\n");
        } else System.out.println("Song \"" + removeTrackName + "\" was not found in the playlist.\n");
    }

    private static int findSong(String songName) {
        for(int i = 0; i < playList.size(); i++) {
            Song song = playList.get(i);
            if(song.getSongName().equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    private static void listPlaylistSongs() {
        ListIterator<Song> i = playList.listIterator();
        if (!i.hasNext()) {
            System.out.println("There are no tracks in the playlist.");
        } else {
            System.out.println("Current playlist:");
            while (i.hasNext()) {
                System.out.println("\t" + (i.nextIndex() + 1) + ". " + i.next().getSongName());
            }
        }
    }

    private static void beginPlayback() {
        boolean stop = false;
        boolean nextTrack = true;
        ListIterator<Song> songs = playList.listIterator();

        if (!songs.hasNext()) {
            System.out.println("There are no tracks in the playlist. Add songs and try again.");
        } else {
            System.out.println("Now playing \"" + songs.next().getSongName() +"\".");
            playListOptions();
        }

        while (!stop) {
            String choice = scanner.nextLine().toLowerCase();
            switch (choice) {
                case "s":
                    System.out.println("Stopping playlist...");
                    stop = true;
                    break;
                case "d":
                    songs.previous();
                    System.out.println("\"" + songs.next().getSongName() + "\" has been deleted from the playlist.");
                    songs.remove();
                    if (songs.hasNext()) {
                        System.out.println("Now playing \"" + songs.next().getSongName() +"\".");
                    } else {
                        System.out.println("All tracks have been removed. Stopping playback.");
                        stop = true;
                    }
                    break;
                case "p":
                    if(nextTrack) {
                        if(songs.hasPrevious()) {
                            songs.previous();
                        }
                        nextTrack = false;
                    }
                    if(songs.hasPrevious()) {
                        System.out.println("Now playing \"" + songs.previous().getSongName() +"\".");
                    } else {
                        System.out.println("Start of playlist reached.");
                        nextTrack = true;
                        System.out.println("Now playing \"" + songs.next().getSongName() +"\".");
                    }
                    break;
                case "n":
                    if(!nextTrack) {
                        if(songs.hasNext()) {
                            songs.next();
                        }
                        nextTrack = true;
                    }
                    if(songs.hasNext()) {
                        System.out.println("Now playing \"" + songs.next().getSongName() +"\".");
                    } else {
                        System.out.println("End of playlist reached. Stopping playback.");
                        stop = true;
                    }
                    break;
                case "r":
                        System.out.println("Now playing \"" + songs.previous().getSongName() +"\".");
                        break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
