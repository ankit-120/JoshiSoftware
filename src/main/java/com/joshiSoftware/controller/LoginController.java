package com.joshiSoftware.controller;

import com.joshiSoftware.dto.LoginDto;
import com.joshiSoftware.dto.UserDto;
import com.joshiSoftware.service.UserService;
import com.joshiSoftware.utils.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("joshiSoftware/login")
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto){
        log.info(loginDto.getUserId());
        UserDto user = this.userService.getUserById(loginDto.getUserId());
        if(!user.getPassword().equals(loginDto.getPassword())){
            return new ResponseEntity<>(new ApiResponse("Incorrect Password",false), HttpStatus.BAD_REQUEST);
        }
        else{
            return new ResponseEntity<>(user,HttpStatus.OK);
        }
    }

}
