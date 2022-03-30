package com.lti.app.scholarshipbackend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lti.app.scholarshipbackend.beans.StateNodalOfficer;
import com.lti.app.scholarshipbackend.service.StateNodalOfficerServiceImpl;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/state")

public class StateNodalOfficerController {
	
	StateNodalOfficerServiceImpl stateService ;
	
	@PutMapping("/addStateNodalOfficer")
	  public int addStateNodalOfficer(@RequestBody StateNodalOfficer s) {
	  return stateService.addStateNodalOfficer(s);
}
	
	@GetMapping("/getStateNodalOfficerAll")

	public List<StateNodalOfficer> getStateNodalOfficerAll() {
		return stateService.getStateNodalOfficerAll();


	}
}
