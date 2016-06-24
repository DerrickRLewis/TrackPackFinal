package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by admin on 6/15/16.
 */

public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String userName);
}