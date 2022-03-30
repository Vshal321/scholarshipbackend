package com.lti.app.scholarshipbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.Login;
import com.lti.app.scholarshipbackend.service.LoginServiceImpl;

@CrossOrigin(origins="*") 
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginService;
	@PostMapping("/addLogin")
	public int addLogin(@RequestBody Login L) {
    return loginService.addLogin(L);
}
}

