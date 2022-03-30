package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StateOfficerRegisteration")
public class StateNodalOfficerRegistration {

	@Id
	@Column(name = "Officer_Id")
	private int OfficerId;
	@Column(name = "Name")
	private String Name;
	@Column(name = "Password")
	private int Password;

	public int getOfficerId() {
		return OfficerId;
	}

	public void setOfficerId(int officerId) {
		OfficerId = officerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	public StateNodalOfficerRegistration(int officerId, String name, int password) {
		super();
		OfficerId = officerId;
		Name = name;
		Password = password;
	}

	public StateNodalOfficerRegistration() {
		super();
	}

	@Override
	public String toString() {
		return "StateNodalOfficerRegistrationController [OfficerId=" + OfficerId + ", Name=" + Name + ", Password="
				+ Password + "]";
	}

}
