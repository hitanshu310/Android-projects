package com.example.hitanshu.musicplayer;

public class SongInfo {
    public String song_title,artist_name,song_url;

    public SongInfo() {
    }

    public SongInfo(String song_title, String artist_name, String song_url) {
        this.song_title = song_title;
        this.artist_name = artist_name;
        this.song_url = song_url;
    }

    public String getSong_title() {
        return song_title;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public String getSong_url() {
        return song_url;
    }

    public void setSong_title(String song_title) {
        this.song_title = song_title;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public void setSong_url(String song_url) {
        this.song_url = song_url;
    }
}
