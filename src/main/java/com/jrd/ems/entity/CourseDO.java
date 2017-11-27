package com.jrd.ems.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class CourseDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7259256257576641523L;

	
	@Id
	@GeneratedValue
	@Column(name = "COURSE_ID")
	private Long courseId;

	@Column(name = "COURSE_NAME")
	private String courseName;

	@Column(name = "COURSE_TYPE")
	private String courseType;

	@Column(name = "COURSE_DURATION")
	private Long duration;

	@Column(name = "AMOUNT")
	private Long amount;

	@Column(name = "DESCRIPTION")
	private String desc;

	public CourseDO() {

	}

	
	public CourseDO(String courseName, String courseType, Long duration,
			Long amount, String desc) {
		this.courseName = courseName;
		this.courseType = courseType;
		this.duration = duration;
		this.amount = amount;
		this.desc = desc;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 *  courseName
	 *   the courseName to set
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
	 *  courseType
	 *            the courseType to set
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
	 * @return the duration
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 *  duration
	 *            the duration to set
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
	 *  desc
	 *            the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 *  amount
	 *            the amount to set
	 */
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	/**
	 * @return the courseId
	 */
	public Long getCourseId() {
		return courseId;
	}

	/**
	 *  courseId
	 *            the courseId to set
	 */
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

}
