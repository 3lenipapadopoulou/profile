package com.example.profile.controller;

import com.example.profile.model.Profile;
import com.example.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @RequestMapping("/")
    public String index(){ return "Welcome to user profile";}

    @PostMapping(value = "/createProfile", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Profile createProfile(@RequestBody Profile newProfile){
        profileService.newProfile();
        return newProfile;
    }
}
