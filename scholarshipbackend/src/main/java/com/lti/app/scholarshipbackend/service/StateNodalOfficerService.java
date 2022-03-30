package com.lti.app.scholarshipbackend.service;

import java.util.List;

import com.lti.app.scholarshipbackend.beans.StateNodalOfficer;

public interface StateNodalOfficerService {
	
	public int addStateNodalOfficer(StateNodalOfficer s);
	public List<StateNodalOfficer> getStateNodalOfficerAll();

}
