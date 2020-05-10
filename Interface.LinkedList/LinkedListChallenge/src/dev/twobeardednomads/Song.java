package dev.twobeardednomads;

import java.util.List;

public class Song {

    private String songName;
    private String songDuration;

    public Song(String songName, String songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongDuration() {
        return songDuration;
    }

    private static int findSong(String songName, List<Song> songList) {
        for(int i = 0; i < songList.size(); i++) {
            Song song = songList.get(i);
            if(song.getSongName().equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    public static Song querySong(String songName, List<Song> songList) {
        int position = findSong(songName, songList);
        if(position >= 0) {
            return songList.get(position);
        }
        return null;
    }
}
