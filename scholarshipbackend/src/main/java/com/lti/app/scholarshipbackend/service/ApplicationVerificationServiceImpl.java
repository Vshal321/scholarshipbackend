package com.lti.app.scholarshipbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.ApplicationVerification;
import com.lti.app.scholarshipbackend.dao.ApplicationVerificationDao;

@Service("applicationService")
public class ApplicationVerificationServiceImpl implements ApplicationVerificationService {

	
	@Autowired
	ApplicationVerificationDao dao;
	

	
	public ApplicationVerificationDao getDao() {
		return dao;
	}


	public void setDao(ApplicationVerificationDao dao) {
		this.dao = dao;
	}



//getbyId
	@Override
	public ApplicationVerification getApplicationById(int id) throws Exception {
		
		return dao.getApplicationVerificationById(id);
	}



//Search all
	@Override
	public List<ApplicationVerification> getApplicationVerificationAll() {
    List<ApplicationVerification>ApplicationVerificationList=dao.getApplicationVerificationAll();
		return ApplicationVerificationList;
		
		
	}

}

