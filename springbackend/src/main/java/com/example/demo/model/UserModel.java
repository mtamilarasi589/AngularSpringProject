package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;
@Entity
@Table(name="user")
public class UserModel {
	
	@Id
	private String email; 
	private String password;
	private String username;
	private String mobileNumber;
	private String qualification;
	private Boolean active;
	private String role;
	
	public UserModel() {
		
	}

	public UserModel(String email, String password, String username, String mobileNumber, String qualification,
			Boolean active, String role) {
		super();
		this.email = email;
		this.password = password;
		this.username = username;
		this.mobileNumber = mobileNumber;
		this.qualification = qualification;
		this.active = active;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	  @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof UserModel)) return false;
	        UserModel user = (UserModel) o;
	        return Objects.equals(username, user.username) &&
	                Objects.equals(password, user.password);
	    }
	@Override
	public String toString() {
		return "UserModel [email=" + email + ", password=" + password + ", username=" + username + ", mobileNumber="
				+ mobileNumber + ", qualification=" + qualification + ", active=" + active + ", role=" + role + "]";
	}

	
	
	

	
}


