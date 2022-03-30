package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="StudentRegistration")
public class StudentRegistration {

	@Id
	@Column(name="STUDENT_ID")
	private int Id;
	@Column(name ="STATE")
	private String State;
	@Column(name ="NAME")
	private String Name;
	@Column(name ="GENDER")
	private String Gender;
	@Column(name ="MOBILE_NO")
	private int MobileNumber;
	@Column(name ="Email_Id")
	private String EmailId;
	@Column(name ="INSTITUDE_CODE")
	private int InstitudeCode;
	@Column(name="COURSE")
	private String Course;
	@Column(name ="AADHAR_NO")
	private int AadharNo;
	@Column(name ="PASSWORD")
	private String Password;
	@Column(name ="CONFIRM_PASSWORD")
	private String ConfirmPassword;
	public String getState() {
		return State;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getInstitudeCode() {
		return InstitudeCode;
	}
	public void setInstitudeCode(int institudeCode) {
		InstitudeCode = institudeCode;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public int getAadharNo() {
		return AadharNo;
	}
	public void setAadharNo(int aadharNo) {
		AadharNo = aadharNo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	public void setState(String state) {
		State = state;
	}
	public StudentRegistration(int id, String state, String name, String gender, int mobileNumber, String emailId,
			int institudeCode, String course, int aadharNo, String password, String confirmPassword) {
		super();
		Id = id;
		State = state;
		Name = name;
		Gender = gender;
		MobileNumber = mobileNumber;
		EmailId = emailId;
		InstitudeCode = institudeCode;
		Course = course;
		AadharNo = aadharNo;
		Password = password;
		ConfirmPassword = confirmPassword;
	}
	public StudentRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "StudentRegistration [Id=" + Id + ", State=" + State + ", Name=" + Name + ", Gender=" + Gender
				+ ", MobileNumber=" + MobileNumber + ", EmailId=" + EmailId + ", InstitudeCode=" + InstitudeCode
				+ ", Course=" + Course + ", AadharNo=" + AadharNo + ", Password=" + Password + ", ConfirmPassword="
				+ ConfirmPassword + "]";
	}
	

}
