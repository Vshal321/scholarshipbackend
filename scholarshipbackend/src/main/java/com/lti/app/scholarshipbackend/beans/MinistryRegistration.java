package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MINISTRY_REGISTRATION")
public class MinistryRegistration {
    
	

	@Id
	@Column(name="MINISTRY_ID")
	private int minId;
	
	@Column(name="MINISTRY_NAME")
	private String minName;
	
	@Column(name="MINISTRY_PASSWORD")
	private String minPassword;
	
	@Column(name="MINISTRY_STATE")
	private String minState;
	
	@Column(name="MINISTRY_MOBILENO")
	private Double mobileNo;
	
	
	public int getMinId() {
		return minId;
	}
	public void setMinId(int minId) {
		this.minId = minId;
	}
	public String getMinName() {
		return minName;
	}
	public void setMinName(String minName) {
		this.minName = minName;
	}
	public String getMinPassword() {
		return minPassword;
	}
	public void setMinPassword(String minPassword) {
		this.minPassword = minPassword;
	}
	public String getMinState() {
		return minState;
	}
	public void setMinState(String minState) {
		this.minState = minState;
	}
	public Double getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Double mobileNo) {
		this.mobileNo = mobileNo;
	}
	public MinistryRegistration(int minId, String minName, String minPassword, String minState, Double mobileNo) {
		super();
		this.minId = minId;
		this.minName = minName;
		this.minPassword = minPassword;
		this.minState = minState;
		this.mobileNo = mobileNo;
	}
	public MinistryRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "MinistryRegistration [minId=" + minId + ", minName=" + minName + ", minPassword=" + minPassword
				+ ", minState=" + minState + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
	
}