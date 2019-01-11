package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackDBService implements TrackService {

    @Autowired
    private TrackRepository trackRepository;

    public TrackDBService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public void setTrackRepository(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTrack() {
        List<Track> trackList = (List<Track>) trackRepository.findAll();
        return trackList;
    }

    @Override
    public Boolean deleteTrack(int id) {
        trackRepository.deleteById(id);
        return true;
    }

    @Override
    public Track updateComment(int id, String comment) {
        Optional<Track> track =  trackRepository.findById(id);
        //trackRepository.deleteById(track.getId());
        track.get().setComment(comment);
        return trackRepository.save(track.get());
    }


}
