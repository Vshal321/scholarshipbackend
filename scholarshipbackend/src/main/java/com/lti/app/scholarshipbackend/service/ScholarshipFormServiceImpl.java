package com.lti.app.scholarshipbackend.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.ScholarshipForm;
import com.lti.app.scholarshipbackend.dao.ScholarshipFormDao;

@Service("SFservice")
public class ScholarshipFormServiceImpl implements ScholarshipFormService {

	
	@Autowired
	ScholarshipFormDao dao;
	
	public ScholarshipFormDao getDao() {
		return dao;
	}

	public void setDao(ScholarshipFormDao dao) {
		this.dao = dao;
	}



	@Override
	@Transactional
	public int addScholarshipForm(ScholarshipForm sf) {
		dao.addScholarshipForm(sf);
		return sf.getStudentId(); 
	}

}
