package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.StateNodalOfficerRegistration;
@Repository
public class StateNodalOfficerRegistrationDaoImpl implements StateNodalOfficerRegistrationDao{

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public int addStateNodalOfficerRegistration(StateNodalOfficerRegistration sr) {
		em.persist(sr);
		return sr.getOfficerId();
	}

}
