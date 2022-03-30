package com.lti.app.scholarshipbackend.service;

import java.util.List;

import com.lti.app.scholarshipbackend.beans.ApplicationVerification;

public interface ApplicationVerificationService {
	
	public ApplicationVerification getApplicationById(int id) throws Exception;
	public List<ApplicationVerification> getApplicationVerificationAll();

}
