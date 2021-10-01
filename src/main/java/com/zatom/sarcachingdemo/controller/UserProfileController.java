package com.zatom.sarcachingdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {


    @GetMapping("/userProfile/{uuid}")
    public ResponseEntity<String> getUserProfileFromUuid(){

        

        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }


       @GetMapping("/tin/{uuid}")
    public ResponseEntity<String> getTinFromUuid(){
        return new ResponseEntity<String>(HttpStatus.NOT_IMPLEMENTED);
    }
}
