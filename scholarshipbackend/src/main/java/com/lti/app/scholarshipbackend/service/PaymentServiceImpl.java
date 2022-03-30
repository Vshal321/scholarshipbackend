package com.lti.app.scholarshipbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.scholarshipbackend.beans.Payment;
import com.lti.app.scholarshipbackend.dao.PaymentDao;

@Service("PayService")
public class PaymentServiceImpl implements PaymentService{

	
	@Autowired
	PaymentDao dao;
	
	
	public PaymentDao getDao() {
		return dao;
	}


	public void setDao(PaymentDao dao) {
		this.dao = dao;
	}


	@Override
	public int addPayment(Payment P) {
	dao.addPayment(P);	
		return P.getPaymentId();
	}
	
	

}
