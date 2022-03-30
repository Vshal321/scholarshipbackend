package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.Login;

@Repository
public class LoginDaoImpl implements LoginDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addLogin(Login L) {
    
		em.persist(L);
		return L.getUserId();
		
	}

}
