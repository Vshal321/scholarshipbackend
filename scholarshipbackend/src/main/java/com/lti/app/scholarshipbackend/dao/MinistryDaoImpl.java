package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.Ministry;

@Repository
public  class MinistryDaoImpl implements MinistryDao {
      
	

	@PersistenceContext
	private EntityManager em;
	
	 
	  
  @Override
  @Transactional
	public int  addMinistry(Ministry e) {

		em.persist(e);
		
		return e.getMinistryId();
		}
	
}
