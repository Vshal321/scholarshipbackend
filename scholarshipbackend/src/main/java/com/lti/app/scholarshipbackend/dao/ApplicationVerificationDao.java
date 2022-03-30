package com.lti.app.scholarshipbackend.dao;

import com.lti.app.scholarshipbackend.beans.ApplicationVerification;

import java.util.List;

public interface ApplicationVerificationDao {

	public ApplicationVerification getApplicationVerificationById(int id) throws Exception;
	
 	public List<ApplicationVerification> getApplicationVerificationAll();
	
	
}
