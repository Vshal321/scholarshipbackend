package com.lti.app.scholarshipbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.app.scholarshipbackend.beans.Payment;
import com.lti.app.scholarshipbackend.service.PaymentServiceImpl;



@CrossOrigin(origins="*") 
@RestController
@RequestMapping("/pay")
public class PaymentController {
	
	
  PaymentServiceImpl PayService;
  
  
  //
  @PutMapping("/addPayment")
  public int addPayment(@RequestBody Payment P) {
	  return PayService.addPayment(P);
		

	}

}
