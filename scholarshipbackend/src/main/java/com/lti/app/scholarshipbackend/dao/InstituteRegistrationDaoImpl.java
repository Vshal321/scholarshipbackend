package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.InstituteRegistration;

@Repository
public class InstituteRegistrationDaoImpl implements InstituteRegistrationDao {
@PersistenceContext
private EntityManager em;
@Override
@Transactional
public int addInstituteRegistration( InstituteRegistration i) {
	em.persist(i);
	return i.getInstid();
	
	
}
}