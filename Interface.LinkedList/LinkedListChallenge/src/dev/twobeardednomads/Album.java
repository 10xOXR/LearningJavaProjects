package dev.twobeardednomads;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String albumTitle;
    private List<Song> albumSongs = new ArrayList<>();

    public Album(String albumTitle, List<Song> albumSongs) {
        this.albumTitle = albumTitle;
        this.albumSongs = albumSongs;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public List<Song> getAlbumSongs() {
        return albumSongs;
    }

    private static int findAlbum(String albumName, List<Album> albumList) {
        for(int i = 0; i < albumList.size(); i++) {
            Album album = albumList.get(i);
            if(album.getAlbumTitle().equals(albumName)) {
                return i;
            }
        }
        return -1;
    }

    public static Album queryAlbum(String albumName, List<Album> albumList) {
        int position = findAlbum(albumName, albumList);
        if(position >= 0) {
            return albumList.get(position);
        }
        return null;
    }
}

