package com.jrd.ems.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class UserLoginDO implements Serializable {

	private static final long serialVersionUID = -624459008490851760L;

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "PASSWORD")
	private String password;

	@OneToOne(mappedBy = "login", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UserRegistrationDO registration;

	public UserLoginDO() {

	}

	public UserLoginDO(String userId, String password) {
		this.userId = userId;
		this.password = password;
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
	 * password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * the registration
	 */
	public UserRegistrationDO getRegistration() {
		return registration;
	}

	/**
	 * registration the registration to set
	 */
	public void setRegistration(UserRegistrationDO registration) {
		this.registration = registration;
	}

}
