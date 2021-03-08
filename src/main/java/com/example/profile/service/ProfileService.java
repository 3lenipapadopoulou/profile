package com.example.profile.service;

import com.example.profile.model.Profile;
import com.example.profile.repositories.ProfileRepository;
import com.example.profile.utilities.HelperClass;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProfileService {


    private  ProfileRepository profileRepository;

    public ProfileService(){

    }

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public Profile newProfile(Profile profile){
        Profile newProfile = new Profile();
        newProfile.setId(HelperClass.CreateRandomId());
        newProfile.setName(profile.getName());
        newProfile.setLastName(profile.getLastName());
        newProfile.setAge(profile.getAge());
        newProfile.setPassword(profile.getPassword());
        //newProfile.setDateOfBirth(LocalDate.now());

        return profileRepository.save(newProfile);
    }
    public Profile readProfile(int id){
        return new Profile();
    }
}
