package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.Ministry;
import com.lti.app.scholarshipbackend.service.MinistryServiceImpl;


@CrossOrigin(origins="*") 
@RestController
@RequestMapping("/mini")
public class MinistryController {
	
	@Autowired
	MinistryServiceImpl miniService;
	
	
	@PostMapping("/addMinistry")
	public int addMinistry(@RequestBody Ministry e) {
	return miniService.addMinistry(e); 
	}
	
}
