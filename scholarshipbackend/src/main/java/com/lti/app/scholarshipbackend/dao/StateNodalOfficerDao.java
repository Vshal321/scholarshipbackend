package com.lti.app.scholarshipbackend.dao;

import java.util.List;

import com.lti.app.scholarshipbackend.beans.StateNodalOfficer;

public interface StateNodalOfficerDao {
	
	public int addStateNodalOfficer(StateNodalOfficer s);
	public List<StateNodalOfficer> getStateNodalOfficerAll();
}

