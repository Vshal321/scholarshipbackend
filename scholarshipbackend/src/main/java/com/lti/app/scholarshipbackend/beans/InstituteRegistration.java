package com.lti.app.scholarshipbackend.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="InstituteRegestration")
public class InstituteRegistration implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Id
@Column(name="instname")
private String instname;

@Id
@Column(name="instid")
private int instid;

@Id
@Column(name="instcode")
private int instcode;

@Id
@Column(name="password")
private String password;

@Id
@Column(name="university")
private String university;

public String getInstname() {
	return instname;
}

public void setInstname(String instname) {
	this.instname = instname;
}

public int getInstid() {
	return instid;
}

public void setInstid(int instid) {
	this.instid = instid;
}

public int getInstcode() {
	return instcode;
}

public void setInstcode(int instcode) {
	this.instcode = instcode;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUniversity() {
	return university;
}

public void setUniversity(String university) {
	this.university = university;
}

public InstituteRegistration(String instname, int instid, int instcode, String password, String university) {
	super();
	this.instname = instname;
	this.instid = instid;
	this.instcode = instcode;
	this.password = password;
	this.university = university;
}

public InstituteRegistration() {
	super();
}

@Override
public String toString() {
	return "InstituteRegistration [instname=" + instname + ", instid=" + instid + ", instcode=" + instcode
			+ ", password=" + password + ", university=" + university + "]";
}


	
}