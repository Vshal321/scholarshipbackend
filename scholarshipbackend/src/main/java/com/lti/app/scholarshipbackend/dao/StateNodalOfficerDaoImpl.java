package com.lti.app.scholarshipbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.StateNodalOfficer;

@Repository
public class StateNodalOfficerDaoImpl implements StateNodalOfficerDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addStateNodalOfficer(StateNodalOfficer s) {
		em.persist(s);
		return s.getOfficerId();
	}

	
	//Search all
	@Override
	public List<StateNodalOfficer> getStateNodalOfficerAll() {
		Query qry= em.createQuery("select s from StateNodalOfficer s");
		List<StateNodalOfficer>StateNodalOfficerList= qry.getResultList();
		
		return StateNodalOfficerList;
	}

}
