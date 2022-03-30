package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Scholarship")
public class ScholarshipForm {

	@Id
	@Column(name = "Application_Id")
	private int ApplicationId;
	@Column(name = "Scheme")
	private String Scheme;
	@Column(name = "Annual_Income")
	private int AnnualIncome;
	@Column(name = "Institude_FName")
	private String InstitudeName;
	@Column(name = "StudentFId")
	private int StudentId;

	public int getApplicationId() {
		return ApplicationId;
	}

	public void setApplicationId(int applicationId) {
		ApplicationId = applicationId;
	}

	public String getScheme() {
		return Scheme;
	}

	public void setScheme(String scheme) {
		Scheme = scheme;
	}

	public int getAnnualIncome() {
		return AnnualIncome;
	}

	public void setAnnualIncome(int annualIncome) {
		AnnualIncome = annualIncome;
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

	public ScholarshipForm(int applicationId, String scheme, int annualIncome, String institudeName, int studentId) {
		super();
		ApplicationId = applicationId;
		Scheme = scheme;
		AnnualIncome = annualIncome;
		InstitudeName = institudeName;
		StudentId = studentId;
	}

	public ScholarshipForm() {
		super();
	}

	@Override
	public String toString() {
		return "ScholarshipForm [ApplicationId=" + ApplicationId + ", Scheme=" + Scheme + ", AnnualIncome="
				+ AnnualIncome + ", InstitudeName=" + InstitudeName + ", StudentId=" + StudentId + "]";
	}

}
