package com.example.profile.service;

import com.example.profile.model.Profile;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProfileService {
    public Profile newProfile(){
        Profile newProfile = new Profile();
        newProfile.setDateOfBirth(LocalDate.now());
        return newProfile;
    }
}
