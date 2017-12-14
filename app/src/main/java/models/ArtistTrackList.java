package models;

import java.util.ArrayList;

/**
 * Created by Bantu Makers on 08/12/2017.
 */

public class ArtistTrackList {
    private int trackListId;
    private int artistId;
    private ArrayList<Track> artistTrack;


    public ArtistTrackList(int trackListId, int artistId, ArrayList<Track> artistTrack) {
        this.trackListId = trackListId;
        this.artistId = artistId;
        this.artistTrack = artistTrack;
    }

    public int getTrackListId() {
        return trackListId;
    }

    public void setTrackListId(int trackListId) {
        this.trackListId = trackListId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public ArrayList<Track> getArtistTrack() {
        return artistTrack;
    }

    public void setArtistTrack(ArrayList<Track> artistTrack) {
        this.artistTrack = artistTrack;
    }
}
