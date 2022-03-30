package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STATE_OFFICER")
public class StateNodalOfficer {
	
	@Id
	@Column(name="Officer_Id")
	private int OfficerId;
	@Column(name="Student_Id")
	private int StudentId;
	@Column(name="Institute_Id")
	private int InstituteId;
	@Column(name="Application_Id")
	private int ApplicationId;
	public int getOfficerId() {
		return OfficerId;
	}
	public void setOfficerId(int officerId) {
		OfficerId = officerId;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public int getInstituteId() {
		return InstituteId;
	}
	public void setInstituteId(int instituteId) {
		InstituteId = instituteId;
	}
	public int getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(int applicationId) {
		ApplicationId = applicationId;
	}
	public StateNodalOfficer(int officerId, int studentId, int instituteId, int applicationId) {
		super();
		OfficerId = officerId;
		StudentId = studentId;
		InstituteId = instituteId;
		ApplicationId = applicationId;
	}
	public StateNodalOfficer() {
		super();
	}
	@Override
	public String toString() {
		return "StateNodalOfficer [OfficerId=" + OfficerId + ", StudentId=" + StudentId + ", InstituteId=" + InstituteId
				+ ", ApplicationId=" + ApplicationId + "]";
	}
	
	
	
}
