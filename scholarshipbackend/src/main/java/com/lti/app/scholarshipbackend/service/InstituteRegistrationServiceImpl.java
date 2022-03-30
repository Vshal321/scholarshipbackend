package com.lti.app.scholarshipbackend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.InstituteRegistration;
import com.lti.app.scholarshipbackend.dao.InstituteRegistrationDao;



@Service("instService")
public class InstituteRegistrationServiceImpl implements InstituteRegistrationService{

	@Autowired
	InstituteRegistrationDao dao;
	
	 public InstituteRegistrationDao  getDao() {
			return dao;
		}
		  public void setDao(InstituteRegistrationDao  dao) {
			this.dao = dao;
		}
		  @Override
		  public int  addInstituteRegistration(InstituteRegistration i) {
		  	
		  int instid= dao.addInstituteRegistration (i);
		  return instid;
}
}