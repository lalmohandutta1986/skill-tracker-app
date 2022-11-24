package com.fse4.lalmohan.skilltrackerapp.adminservice.controller;


import com.fse4.lalmohan.skilltrackerapp.adminservice.entity.Engineer;
import com.fse4.lalmohan.skilltrackerapp.adminservice.model.FseProfile;
import com.fse4.lalmohan.skilltrackerapp.adminservice.model.Response;
import com.fse4.lalmohan.skilltrackerapp.adminservice.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:9005")
@RequestMapping("/api/v1.0/engineer")
public class AdminController {

	@Autowired
	private AdminService adminService;


	Logger logger = LoggerFactory.getLogger(AdminController.class);

	@PostMapping("/add-profile")
	public ResponseEntity<String> addProfile(@RequestBody FseProfile profile){
		Response response = adminService.addProfile(profile);
		return ResponseEntity.status(response.status).body(response.message);
	}

	@GetMapping("/get-profile/{associateId}")
	public Engineer getProfile(@PathVariable("associateId") Long associateId){
		List<Engineer> profile = adminService.findByAssociateId(associateId);
		if(!profile.isEmpty()){
			return profile.get(0);
		}else{
			return null;
		}

	}



	@PostMapping("/add-profile-2")
	public ResponseEntity<String> addProfile2(){

		return ResponseEntity.status(HttpStatus.OK).body("Add Profile 222");
	}
	@GetMapping("/get-profile")
	public ResponseEntity<String> getProfile(){
		return ResponseEntity.status(HttpStatus.OK).body("GET OUTPUT");
	}



}
