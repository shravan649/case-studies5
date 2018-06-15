package com.cg.project.beans;

import java.util.List;

public class UserBean {
private String userName,password,firstName,lastName,gender,mobileNumber,email,graduation,description;
private List<String>communication;
public UserBean(){}
public UserBean(String userName, String password, String firstName, String lastName, String gender, String mobileNumber,
		String email, String graduation, String description, List<String> communication) {
	super();
	this.userName = userName;
	this.password = password;
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.mobileNumber = mobileNumber;
	this.email = email;
	this.graduation = graduation;
	this.description = description;
	this.communication = communication;
}
public UserBean(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGraduation() {
	return graduation;
}
public void setGraduation(String graduation) {
	this.graduation = graduation;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public List<String> getCommunication() {
	return communication;
}
public void setCommunication(List<String> communication) {
	this.communication = communication;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((communication == null) ? 0 : communication.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((graduation == null) ? 0 : graduation.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + ((userName == null) ? 0 : userName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	UserBean other = (UserBean) obj;
	if (communication == null) {
		if (other.communication != null)
			return false;
	} else if (!communication.equals(other.communication))
		return false;
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (graduation == null) {
		if (other.graduation != null)
			return false;
	} else if (!graduation.equals(other.graduation))
		return false;
	if (lastName == null) {
		if (other.lastName != null)
			return false;
	} else if (!lastName.equals(other.lastName))
		return false;
	if (mobileNumber == null) {
		if (other.mobileNumber != null)
			return false;
	} else if (!mobileNumber.equals(other.mobileNumber))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (userName == null) {
		if (other.userName != null)
			return false;
	} else if (!userName.equals(other.userName))
		return false;
	return true;
}
@Override
public String toString() {
	return "UserBean [userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName="
			+ lastName + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", email=" + email + ", graduation="
			+ graduation + ", description=" + description + ", communication=" + communication + "]";
}

}
