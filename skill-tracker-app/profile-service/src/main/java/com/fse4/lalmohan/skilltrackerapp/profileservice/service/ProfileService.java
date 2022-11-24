package com.fse4.lalmohan.skilltrackerapp.profileservice.service;

import com.fse4.lalmohan.skilltrackerapp.profileservice.model.Response;
import com.fse4.lalmohan.skilltrackerapp.profileservice.entity.Engineer;
import com.fse4.lalmohan.skilltrackerapp.profileservice.model.FseProfile;
import com.fse4.lalmohan.skilltrackerapp.profileservice.repository.ProfileRepository;
import com.fse4.lalmohan.skilltrackerapp.profileservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

	@Autowired
	ProfileRepository profileRepository;

	@Autowired
	SkillRepository skillRepository;

	public List<Engineer> findByAssociateId(Long associateId) {
		return profileRepository.findAll();
	}

	public Response addProfile(FseProfile profile) {

		Response response = new Response();

		try {
			profileRepository.save(profile.getEngineer());

			skillRepository.saveAll(profile.getSkillSet());

			System.out.println("inside add profile");

			response.setStatus(HttpStatus.OK.value());

			response.setMessage("Added successfully"  +profile);
		}catch (Exception e){
			response.setStatus(HttpStatus.BAD_REQUEST.value());

			response.setMessage(e.getMessage());
		}



		return response;
	}


	public Response updateProfile(FseProfile profile) {

		Response response = new Response();

		try {
			profileRepository.save(profile.getEngineer());

			skillRepository.saveAll(profile.getSkillSet());

			response.setStatus(HttpStatus.OK.value());

			response.setMessage("Added successfully"  + profile);
		}catch (Exception e){
			response.setStatus(HttpStatus.BAD_REQUEST.value());

			response.setMessage(e.getMessage());
		}



		return response;
	}




}
