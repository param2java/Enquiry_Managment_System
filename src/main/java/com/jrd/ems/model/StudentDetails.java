package com.jrd.ems.model;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class StudentDetails {

	
	private String firstName;
	
	private String lastName;
	
	private String dob;
	
	private String address;
	
	private Long phoneNo;	
	
	private String comments;
	
	
	public StudentDetails(){
		
	}

	/**
	 *  firstName
	 *  lastName
	 *  dOB
	 *  address
	 *  phoneNo
	 *  comments
	 */
	public StudentDetails(String firstName, String lastName, String dob,
			String address, Long phoneNo, String comments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
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
	
	
}
