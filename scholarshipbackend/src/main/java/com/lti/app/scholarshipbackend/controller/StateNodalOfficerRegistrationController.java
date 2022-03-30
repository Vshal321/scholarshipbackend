package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.StateNodalOfficerRegistration;
import com.lti.app.scholarshipbackend.service.StateNodalOfficerRegistrationServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/off")
public class StateNodalOfficerRegistrationController {
	
	@Autowired
	StateNodalOfficerRegistrationServiceImpl offService ;
	
	@PostMapping("/addStateNodalOfficerRegistration")
	 public int addStateNodalRegistration(@RequestBody StateNodalOfficerRegistration sr) {
		return offService.addStateNodalOfficerRegistration(sr);
		
		
		
	}
}