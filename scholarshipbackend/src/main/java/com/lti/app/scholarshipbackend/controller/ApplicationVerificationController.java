package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.lti.app.scholarshipbackend.beans.ApplicationVerification;
import com.lti.app.scholarshipbackend.service.ApplicationVerificationService;
import com.lti.app.scholarshipbackend.service.ApplicationVerificationServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/application")
public class ApplicationVerificationController {
	
 
	@Autowired
    ApplicationVerificationServiceImpl applicationService;
	
	
	@GetMapping("/getApplicationVerificationAll")
	public  List<ApplicationVerification>getApplicationVerificationAll(){
		return applicationService.getApplicationVerificationAll();
		
		
	}
}
