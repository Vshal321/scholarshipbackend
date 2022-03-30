package com.lti.app.scholarshipbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.Login;
import com.lti.app.scholarshipbackend.dao.LoginDao;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

	 @Autowired
     LoginDao dao;
	
	
	public LoginDao getDao() {
		return dao;
	}


	public void setDao(LoginDao dao) {
		this.dao = dao;
	}


	@Override
	public int addLogin(Login L) {
		dao.addLogin(L);
		return L.getUserId();
	}

}
