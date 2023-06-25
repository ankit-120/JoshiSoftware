package com.joshiSoftware.service;

import com.joshiSoftware.dto.UserDto;

public interface UserService {

    //get user by userid
    UserDto getUserById(String userId);

}
