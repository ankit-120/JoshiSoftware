package com.joshiSoftware.service.serviceImpl;

import com.joshiSoftware.dto.UserDto;
import com.joshiSoftware.entity.User;
import com.joshiSoftware.exception.ResourceNotFoundException;
import com.joshiSoftware.repo.UserRepo;
import com.joshiSoftware.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto getUserById(String userId) {
        log.info(userId);
        User byUserId = this.userRepo.findByUserId(userId);
        if(byUserId == null){
            throw new ResourceNotFoundException("User not found");
        }
        return this.modelMapper.map(byUserId, UserDto.class);
    }
}
