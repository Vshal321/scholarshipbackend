package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MINISTRY")
public class Ministry {
	
	
	
	@Id
	@Column(name="MINISTRY_FID")
     private int ministryId;
	
	
	@Column(name="STUDENT_FID")
     private int studId;
	
	
	@Column(name="INSTITUTE_FID")
     private int InstId;
	
	
	
	@Column(name="APPLICATION_FID")
     private int ApplicationId;



	public int getMinistryId() {
		return ministryId;
	}



	public void setMinistryId(int ministryId) {
		this.ministryId = ministryId;
	}



	public int getStudId() {
		return studId;
	}



	public void setStudId(int studId) {
		this.studId = studId;
	}



	public int getInstId() {
		return InstId;
	}



	public void setInstId(int instId) {
		InstId = instId;
	}



	public int getApplicationId() {
		return ApplicationId;
	}



	public void setApplicationId(int applicationId) {
		ApplicationId = applicationId;
	}



	public Ministry(int ministryId, int studId, int instId, int applicationId) {
		super();
		this.ministryId = ministryId;
		this.studId = studId;
		InstId = instId;
		ApplicationId = applicationId;
	}



	public Ministry() {
		super();
	}



	@Override
	public String toString() {
		return "Ministry [ministryId=" + ministryId + ", studId=" + studId + ", InstId=" + InstId + ", ApplicationId="
				+ ApplicationId + "]";
	}
     
     
}
