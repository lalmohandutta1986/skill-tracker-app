package com.fse4.lalmohan.skilltrackerapp.profileservice.controller;

import com.fse4.lalmohan.skilltrackerapp.profileservice.entity.Engineer;
import com.fse4.lalmohan.skilltrackerapp.profileservice.model.FseProfile;
import com.fse4.lalmohan.skilltrackerapp.profileservice.model.Response;
import com.fse4.lalmohan.skilltrackerapp.profileservice.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:9006")
@RequestMapping("/api/v1.0/engineer")
public class ProfileController {

    @Autowired
    private ProfileService profileService;


    Logger logger = LoggerFactory.getLogger(ProfileController.class);

    @PostMapping("/add-profile")
    public ResponseEntity<String> addProfile(@RequestBody FseProfile profile){
        Response response = profileService.addProfile(profile);
        return ResponseEntity.status(response.status).body(response.message);
    }

    @GetMapping("/get-profile/{associateId}")
    public Engineer getProfile(@PathVariable("associateId") Long associateId) {
        List<Engineer> profile = profileService.findByAssociateId(associateId);
        if (!profile.isEmpty()) {
            return profile.get(0);
        } else {
            return null;
        }
    }
}
