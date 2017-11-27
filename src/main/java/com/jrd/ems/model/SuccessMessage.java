package com.jrd.ems.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SuccessMessage {

	
	private String message;
	
	private int code;
	
	
	public SuccessMessage(){
		
	}


	/**
	 *  message
	 *  code
	 */
	public SuccessMessage(String message, int code) {
		super();
		this.message = message;
		this.code = code;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 *  message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}


	/**
	 *  code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

		
}
