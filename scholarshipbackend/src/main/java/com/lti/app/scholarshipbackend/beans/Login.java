package com.lti.app.scholarshipbackend.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")
public class Login {

@Id
@Column(name="User_Id")	
private int UserId;
@Column(name="PASSWORD")
private int Password;
@Column(name="ROLE")
private String Role;
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public int getPassword() {
	return Password;
}
public void setPassword(int password) {
	Password = password;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public Login(int userId, int password, String role) {
	super();
	UserId = userId;
	Password = password;
	Role = role;
}
public Login() {
	super();
}
@Override
public String toString() {
	return "Login [UserId=" + UserId + ", Password=" + Password + ", Role=" + Role + "]";
}


	

}
