package com.lti.app.scholarshipbackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.app.scholarshipbackend.beans.Payment;

@Repository
public class PaymentDaoImpl  implements PaymentDao {
   
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public int addPayment(Payment P) {
		
		em.persist(P);
		return P.getPaymentId();
	}

}
