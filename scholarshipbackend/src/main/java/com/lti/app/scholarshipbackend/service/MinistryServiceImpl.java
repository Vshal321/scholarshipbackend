package com.lti.app.scholarshipbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.Ministry;
import com.lti.app.scholarshipbackend.dao.MinistryDao;
@Service("MinService")
public class MinistryServiceImpl implements MinistryService {
	 @Autowired
	  MinistryDao dao;
	  
	  public  MinistryDao getDao() {
		return dao;
	}
	  public void setDao( MinistryDao dao) {
		this.dao = dao;
	}
	@Override
	public int addMinistry(Ministry e) {
		dao.addMinistry(e);
		return e.getMinistryId();
	}

}
    