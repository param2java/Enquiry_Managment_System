package com.jrd.ems.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class StudentDO implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4710086372398273097L;

	@Id
	@GeneratedValue
	@Column(name="STUDENT_ID")
	private Long id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PHONE_NO")
	private Long phoneNo;	
	
	@Column(name="COMMENTS")
	private String comments;
	
   public StudentDO(){
		
	}

	
	public StudentDO(String firstName, String lastName, String dOB,
			String address, Long phoneNo, String comments) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dOB;
		this.address = address;
		this.phoneNo = phoneNo;
		this.comments = comments;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 *  firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 *  lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 *  dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 *  address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNo
	 */
	public Long getPhoneNo() {
		return phoneNo;
	}

	/**
	 *  phoneNo the phoneNo to set
	 */
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 *  comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 *  id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

		
}
