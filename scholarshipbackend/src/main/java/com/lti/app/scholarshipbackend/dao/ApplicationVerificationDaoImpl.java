package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.ApplicationVerification;

@Repository
public class ApplicationVerificationDaoImpl implements ApplicationVerificationDao {

	@PersistenceContext
	private EntityManager em;
   	

//Find Application
	@Override
	@Transactional
	public ApplicationVerification getApplicationVerificationById( int StudentId) throws Exception {
		ApplicationVerification Stud = em.find(ApplicationVerification.class,StudentId);
		if(Stud !=null ) {
			return Stud;
		}else {
			throw new Exception("Application Does Not Found");
			
		}
	
	}
	
	//Find All Application

	@Override
	@Transactional
	public List <ApplicationVerification> getApplicationVerificationAll() {
		Query qry = em.createQuery("Select Stud from Stud");
	    List<ApplicationVerification> ApplicationVerificationList=qry.getResultList();
		return ApplicationVerificationList;
			
	}


}
