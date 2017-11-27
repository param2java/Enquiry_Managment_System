package com.jrd.ems.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	
	private String errorMessage;
	
	private int errorCode;
	
	
	public ErrorMessage(){
		
	}

	/**
	 *  errorMessage
	 *  errorCode
	 *  documentation
	 */
	public ErrorMessage(String errorMessage, int errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 *  errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the errorCode
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 *  errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	
	
}
