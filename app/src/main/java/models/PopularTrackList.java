package models;

import java.util.ArrayList;

/**
 * Created by Bantu Makers on 18/12/2017.
 */

public class PopularTrackList {
    private int popularTrackListId;
    private int popularArtistId;
    private ArrayList<Track> popularArtistTrack;

    public PopularTrackList(int popularTrackListId, int popularArtistId, ArrayList<Track> popularArtistTrack) {
        this.popularTrackListId = popularTrackListId;
        this.popularArtistId = popularArtistId;
        this.popularArtistTrack = popularArtistTrack;
    }

    public int getPopularTrackListId() {
        return popularTrackListId;
    }

    public void setPopularTrackListId(int popularTrackListId) {
        this.popularTrackListId = popularTrackListId;
    }

    public int getPopularArtistId() {
        return popularArtistId;
    }

    public void setPopularArtistId(int popularArtistId) {
        this.popularArtistId = popularArtistId;
    }

    public ArrayList<Track> getPopularArtistTrack() {
        return popularArtistTrack;
    }

    public void setPopularArtistTrack(ArrayList<Track> popularArtistTrack) {
        this.popularArtistTrack = popularArtistTrack;
    }
}
