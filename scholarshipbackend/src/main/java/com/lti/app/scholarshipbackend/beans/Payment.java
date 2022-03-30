package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment {
	

	@Id
	@Column(name="Payment_Id")
	private int PaymentId;
	@Column(name="Student_FId")
	private int StudentId;
	public int getPaymentId() {
		return PaymentId;
	}
	public void setPaymentId(int paymentId) {
		PaymentId = paymentId;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public Payment(int paymentId, int studentId) {
		super();
		PaymentId = paymentId;
		StudentId = studentId;
	}
	public Payment() {
		super();
	}
	@Override
	public String toString() {
		return "Payment [PaymentId=" + PaymentId + ", StudentId=" + StudentId + "]";
	}
	
	

}
