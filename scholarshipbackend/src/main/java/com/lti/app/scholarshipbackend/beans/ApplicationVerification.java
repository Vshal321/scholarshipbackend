package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Application_Verification")
public class ApplicationVerification {
	
	
	@Id
	@Column(name="COURSE")
	private String Course;
	@Column(name="Institude_FName")
	private String InstitudeName;
	@Column(name="Student_FId")
	private int StudentId;
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getInstitudeName() {
		return InstitudeName;
	}
	public void setInstitudeName(String institudeName) {
		InstitudeName = institudeName;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public ApplicationVerification(String course, String institudeName, int studentId) {
		super();
		Course = course;
		InstitudeName = institudeName;
		StudentId = studentId;
	}
	public ApplicationVerification() {
		super();
	}
	@Override
	public String toString() {
		return "ApplicationVerification [Course=" + Course + ", InstitudeName=" + InstitudeName + ", StudentId="
				+ StudentId + "]";
	}
	

}  
