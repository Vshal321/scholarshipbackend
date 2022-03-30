package com.lti.app.scholarshipbackend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.StateNodalOfficer;
import com.lti.app.scholarshipbackend.dao.StateNodalOfficerDao;

@Service("stateService")
public class StateNodalOfficerServiceImpl implements StateNodalOfficerService{

	@Autowired
	StateNodalOfficerDao dao;
	
	
	public StateNodalOfficerDao getDao() {
		return dao;
	}


	public void setDao(StateNodalOfficerDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int addStateNodalOfficer(StateNodalOfficer s) {
		dao.addStateNodalOfficer(s);
		return s.getOfficerId() ;
	}


	@Override
	public List<StateNodalOfficer> getStateNodalOfficerAll() {
		List<StateNodalOfficer>stateNodalOfficerList=dao.getStateNodalOfficerAll();
		return stateNodalOfficerList;
	}


}
