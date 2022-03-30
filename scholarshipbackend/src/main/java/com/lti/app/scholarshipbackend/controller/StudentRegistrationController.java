package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.StudentRegistration;
import com.lti.app.scholarshipbackend.service.StudentRegistrationServiceImpl;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/student")
public class StudentRegistrationController  {
	
	
	@Autowired
	StudentRegistrationServiceImpl studentService;
	
	public int addStudentRegistration(@RequestBody StudentRegistration s) {
		return studentService.addStudentRegistration(s);
		
	}
	

	  
	
			

		}
	

