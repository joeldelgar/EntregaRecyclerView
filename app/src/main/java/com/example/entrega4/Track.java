package com.example.entrega4;

public class Track {
    public String songname;
    public String artist;

    //CONSTRUCTOR

    public  Track (String songname, String artist){
        this.songname=songname;
        this.artist=artist;
    }

    //GETTERS AND SETTERS

    public String getArtist() {
        return artist;
    }

    public String getSongname() {
        return songname;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }
}
