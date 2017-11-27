package com.jrd.ems.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Registration")
public class UserRegistrationDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4870630640484819136L;

	@Id
	@Column(name = "EMAIL_ID")
	private String email;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "CONFIRM_PASSWORD")
	private String confirmPassword;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "USER_LOGIN_ID")
	private UserLoginDO login;

	public UserRegistrationDO() {

	}

	public UserRegistrationDO(String userId, String password,
			String confirmPassword, String email) {
		this.userId = userId;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
	}

	/**
	 * the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}

	/**
	 * confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	/**
	 * the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 *  the login
	 */
	public UserLoginDO getLogin() {
		return login;
	}

	/**
	 * login the login to set
	 */
	public void setLogin(UserLoginDO login) {
		this.login = login;
	}

}
