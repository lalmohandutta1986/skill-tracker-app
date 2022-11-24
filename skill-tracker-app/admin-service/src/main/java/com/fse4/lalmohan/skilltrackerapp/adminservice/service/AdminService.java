package com.fse4.lalmohan.skilltrackerapp.adminservice.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.fse4.lalmohan.skilltrackerapp.adminservice.entity.Engineer;
import com.fse4.lalmohan.skilltrackerapp.adminservice.model.FseProfile;
import com.fse4.lalmohan.skilltrackerapp.adminservice.model.Response;
import com.fse4.lalmohan.skilltrackerapp.adminservice.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;

	public List<Engineer> findByAssociateId(Long associateId) {
		return adminRepository.findAll();
	}

	public Response addProfile(FseProfile profile) {
		Response response = new Response();

		adminRepository.save(profile.getEngineer());

		System.out.println("inside add profile");

		response.setStatus(HttpStatus.OK.value());

		response.setMessage("Added successfully");

		return response;
	}





}
