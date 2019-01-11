package com.stackroute.service;

import com.stackroute.domain.Track;

import java.util.List;
import java.util.Optional;

public interface TrackService {
    public Track saveTrack(Track track);
    public List<Track> getAllTrack();
    public Boolean deleteTrack(int id);
    public Track updateComment(int id, String comment);
}
