package com.jrd.ems.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserLogin{
	
	
	private String userId;
	
	private String password;
	
    public UserLogin(){
		
	}

	public UserLogin(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
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
	
	
	
	

}
