package com.example.profile.controller;

import com.example.profile.model.Profile;
import com.example.profile.service.ProfileService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping(value = "/createProfile", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Profile createProfile(@RequestBody Profile newProfile) {
        Profile user = profileService.newProfile(newProfile);
        return user;
    }

    @GetMapping("/getProfile")
    public Profile readProfile(int id) {
        Profile profile = profileService.readProfile(id);
        return profile;
    }


}
