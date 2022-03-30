package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.ScholarshipForm;

@Repository
public class ScholarshipFormDaoImpl implements ScholarshipFormDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int addScholarshipForm(ScholarshipForm sf) {
		em.persist(sf);	
		return sf.getStudentId();
	}

}
