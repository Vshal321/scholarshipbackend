package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.MinistryRegistration;
@Repository
public class MinistryRegistrationDaoImpl implements MinistryRegistrationDao{
     
	

	@PersistenceContext
	private EntityManager em;
	
	 
	  
  @Override
  @Transactional
	public int  addMinistryRegistration(MinistryRegistration e) {
		em.persist(e);
		return e.getMinId();
		}
	
	
}
