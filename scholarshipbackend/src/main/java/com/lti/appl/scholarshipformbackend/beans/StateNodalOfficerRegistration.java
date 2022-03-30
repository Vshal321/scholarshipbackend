package com.lti.appl.scholarshipformbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="OFFICER_REGISTRATION")
public class StateNodalOfficerRegistration {
	@Id
	@Column(name="OFFICER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="OFFICER_SEQ")
	@SequenceGenerator(name="OFFICER_SEQ",sequenceName="officer_seq",allocationSize=1)
 private int offid;
	@Column(name="OFF_PASSWORD")
 private String offpassword;
	@Column(name="OFF_NAME")
 private String offname;
	@Column(name="OFF_GRADE")
	private String grade;
	@Column(name="STATE")
	private String state;
@Column(name="PHONE_NUMBER")
 private double phoneno;
public int getOffid() {
	return offid;
}
public void setOffid(int offid) {
	this.offid = offid;
}
public String getOffpassword() {
	return offpassword;
}
public void setOffpassword(String offpassword) {
	this.offpassword = offpassword;
}
public String getOffname() {
	return offname;
}
public void setOffname(String offname) {
	this.offname = offname;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public double getPhoneno() {
	return phoneno;
}
public void setPhoneno(double phoneno) {
	this.phoneno = phoneno;
}
public StateNodalOfficerRegistration(int offid, String offpassword, String offname, String grade, String state,
		double phoneno) {
	super();
	this.offid = offid;
	this.offpassword = offpassword;
	this.offname = offname;
	this.grade = grade;
	this.state = state;
	this.phoneno = phoneno;
}
public StateNodalOfficerRegistration() {
	super();
}
@Override
public String toString() {
	return "StateNodalOfficerRegistration [offid=" + offid + ", offpassword=" + offpassword + ", offname=" + offname
			+ ", grade=" + grade + ", state=" + state + ", phoneno=" + phoneno + "]";
}



}