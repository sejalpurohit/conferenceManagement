package main.java.com.conference.management.bo;

import java.util.*;

/**
 * Created by girmes on 22/05/17.
 */
public class Conference {
    List<Track> tracks;

    public List<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }

    public Conference(){
        this.tracks = new ArrayList();
    }
}


