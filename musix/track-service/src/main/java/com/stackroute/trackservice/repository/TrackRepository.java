package com.stackroute.trackservice.repository;

import com.stackroute.trackservice.domain.Track;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * this is an interface which extends JpaRepository interface which has its own methods which we can use in our project
 * this is also useful for interfacing our project with the database
 */
public interface TrackRepository extends MongoRepository<Track,Integer> {

    List<Track> findByTrack(String track);

}
