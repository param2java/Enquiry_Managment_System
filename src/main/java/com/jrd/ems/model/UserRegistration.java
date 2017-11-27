package com.jrd.ems.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserRegistration {
	

	private String userId;
	private String password;
	private String confirmPassword;
	private String email;
	
	public UserRegistration(){
		
	}
	
	/**
	 *  userId
	 *  password
	 *  confirmPassword
	 *  email
	 */
	public UserRegistration(String userId, String password,
			String confirmPassword, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 *  userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 *  password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 *  confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 *  email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	}
