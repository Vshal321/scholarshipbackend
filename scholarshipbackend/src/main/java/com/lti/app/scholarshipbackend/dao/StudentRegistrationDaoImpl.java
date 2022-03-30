package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.lti.app.scholarshipbackend.beans.StudentRegistration;

@Repository
public class StudentRegistrationDaoImpl implements StudentRegistrationDao {

	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addStudentRegistration(StudentRegistration s) {
		em.persist(s);
		return s.getId();
	}
	
	
}

