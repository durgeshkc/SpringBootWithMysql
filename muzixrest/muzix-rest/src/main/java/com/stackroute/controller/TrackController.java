package com.stackroute.controller;

import com.stackroute.domain.Track;
import com.stackroute.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//Use an interface that can be implemented by UserService and UserAWSService
@RequestMapping("api/v1/")
public class TrackController {

    @Autowired
    private TrackService trackService;
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
    public void setTrackService(TrackService trackService) {
        this.trackService = trackService;
    }

    @RequestMapping(value = "track", method = RequestMethod.POST)
    public ResponseEntity<Track> saveTrack(@RequestBody Track track) {
        Track track1 = trackService.saveTrack(track);
        return new ResponseEntity<Track>(track1, HttpStatus.OK);
    }
    @RequestMapping(value = "tracks", method = RequestMethod.GET)
    public ResponseEntity<List<Track>> listOfTrack() {
        List<Track> allTrack = trackService.getAllTrack();
        return new ResponseEntity<List<Track>>(allTrack, HttpStatus.OK);
    }

    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public Boolean deleteTrack(@PathVariable("id") String id )
    {
        return trackService.deleteTrack(Integer.parseInt(id));
    }
    @RequestMapping(value = "update/{comment}/{id}", method = RequestMethod.POST)
    public ResponseEntity<Track> updateComment(@PathVariable("id") String id,@PathVariable("comment") String comment)
    {
        return new ResponseEntity<Track>(trackService.updateComment(Integer.parseInt(id),comment),HttpStatus.OK);
    }

}
