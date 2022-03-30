package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.ScholarshipForm;
import com.lti.app.scholarshipbackend.service.ScholarshipFormServiceImpl;


@CrossOrigin(origins="*") 
@RestController
@RequestMapping("/scholarshipform")
public class ScholarshipFormController {
	
	@Autowired
	ScholarshipFormServiceImpl scholarshipformservice;
	
	
	// http:localhost:8686/ScholarshipForm/addScholarship
	
	@PostMapping("/addScholarshipForm")
	public int addScholarshipForm(@RequestBody ScholarshipForm sf) {
	return scholarshipformservice.addScholarshipForm(sf);
}
}
