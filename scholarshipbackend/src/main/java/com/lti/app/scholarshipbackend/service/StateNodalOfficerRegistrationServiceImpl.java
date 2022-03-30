package com.lti.app.scholarshipbackend.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.StateNodalOfficerRegistration;
import com.lti.app.scholarshipbackend.dao.StateNodalOfficerRegistrationDao;

@Service("offService")
public class StateNodalOfficerRegistrationServiceImpl implements StateNodalOfficerRegistrationService {
   
	@Autowired
	StateNodalOfficerRegistrationDao dao; 
	
	
	public StateNodalOfficerRegistrationDao getDao() {
		return dao;
	}

	public void setDao(StateNodalOfficerRegistrationDao dao) {
		this.dao = dao;
	}


	@Override
	@Transactional
	public int addStateNodalOfficerRegistration(StateNodalOfficerRegistration sr) {
		
		dao.addStateNodalOfficerRegistration(sr);
		return sr.getOfficerId();	
				}


	
}