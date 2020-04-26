package dev.twobeardednomads;

import java.util.ArrayList;

public class Album {

    private String albumTitle;
    private ArrayList<Song> albumSongs;

    public Album(String albumTitle, ArrayList<Song> albumSongs) {
        this.albumTitle = albumTitle;
        this.albumSongs = albumSongs;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getAlbumSongs() {
        return albumSongs;
    }

    private static int findAlbum(String albumName, ArrayList<Album> albumList) {
        for(int i = 0; i < albumList.size(); i++) {
            Album album = albumList.get(i);
            if(album.getAlbumTitle().equals(albumName)) {
                return i;
            }
        }
        return -1;
    }

    public static Album queryAlbum(String albumName, ArrayList<Album> albumList) {
        int position = findAlbum(albumName, albumList);
        if(position >= 0) {
            return albumList.get(position);
        }
        return null;
    }
}

