package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.InstituteRegistration;
import com.lti.app.scholarshipbackend.service.InstituteRegistrationServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/inst")
public class InstituteRegistrationController {
	@Autowired
	InstituteRegistrationServiceImpl instService;
	
	
	@PostMapping("/addInstituteRegistration")
	public int addInstituteRegistration(@RequestBody InstituteRegistration ir) {
				
	return instService.addInstituteRegistration(ir);}
}