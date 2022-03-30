package com.lti.app.scholarshipbackend.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.StudentRegistration;
import com.lti.app.scholarshipbackend.dao.StudentRegistrationDao;
@Service("studentService")
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
    @Autowired
	StudentRegistrationDao dao;

	public StudentRegistrationDao getDao() {
		return dao;
	}

	public void setDao(StudentRegistrationDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int addStudentRegistration(StudentRegistration s) {
	
		dao.addStudentRegistration(s);
		return s.getId();
	}

}
