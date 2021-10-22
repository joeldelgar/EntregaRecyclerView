package com.example.entrega4;

import java.util.LinkedList;
import java.util.List;

public class TrackManagerImpl implements TrackManager{
    private static TrackManager instance;
    protected List<Track> tracks;

    private TrackManagerImpl(){
        this.tracks = new LinkedList<>();
    }

    public static TrackManager getInstance(){
        if(instance==null){
            instance = new TrackManagerImpl();
        }
        return instance;
    }


    @Override
    public Track addTrack(Track track) {
        this.tracks.add(track);
        return track;
    }

    @Override
    public Track editTrack(Track t) {
        Track track = this.getTrack(t.getId());
        //.....
        return track;
    }

    @Override
    public void deleteTrack(String id) {
        Track track = this.getTrack(id);
        this.tracks.remove(track);
    }

    @Override
    public Track getTrack(String id) {
        for(Track t: this.tracks){
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }

}
