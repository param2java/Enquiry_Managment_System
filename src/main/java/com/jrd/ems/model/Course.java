package com.jrd.ems.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {
	
	private Long courseId;
	private String courseName;
	private String courseType;
	private Long duration;
	private Long amount;
	private String desc;
	
	public Course(){
		
	}
	
	
	public Course(Long courseId, String courseName, String courseType,
			Long duration, Long amount, String desc) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseType = courseType;
		this.duration = duration;
		this.amount = amount;
		this.desc = desc;
	}

	/**
	 * @return the courseId
	 */
	public Long getCourseId() {
		return courseId;
	}

	/**
	 *  courseId the courseId to set
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 *  courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the courseType
	 */
	public String getCourseType() {
		return courseType;
	}
	/**
	 *  courseType the courseType to set
	 */
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
	/**
	 * @return the amount
	 */
	public Long getAmount() {
		return amount;
	}
	/**
	 *  amount the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * @return the duration
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 *  duration the duration to set
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 *  desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	

}
