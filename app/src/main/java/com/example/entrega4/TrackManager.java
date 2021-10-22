package com.example.entrega4;

public interface TrackManager {
    public Track addTrack(Track track);
    public Track editTrack(Track track);
    public void deleteTrack(String id);
    public Track getTrack (String id);

}
