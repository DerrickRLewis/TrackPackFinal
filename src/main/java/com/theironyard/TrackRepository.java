package com.theironyard;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by admin on 6/9/16.
 */
public interface TrackRepository extends CrudRepository<Tracking,Integer> {

    @Override
    List<Tracking> findAll();

}
