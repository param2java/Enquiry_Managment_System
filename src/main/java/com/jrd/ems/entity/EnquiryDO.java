package com.jrd.ems.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ENQUIRY")
public class EnquiryDO implements Serializable{	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5310227520204860908L;

	
	@Id
	@GeneratedValue
	@Column(name="ENQUIRY_ID")
	private Long  enquiryId;
	
	@Column(name="ENQUIRY_TYPE")
	private String type;	
	
	@Column(name="SOURCE")
	private String source;
	
	@Column(name="DESCRIPTION")
	private String desc;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ENQUIRY_DATE")
	private Date enquiryDate;
	
	@OneToOne
	@JoinColumn(name="COURSE_ID")
    private CourseDO course;
	
	
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
    private StudentDO student;
	
	
	public EnquiryDO(){
		
	}

	
	
	public EnquiryDO(Long enquiryId, String type, String source, String desc,
			Date enquiryDate) {
		this.enquiryId = enquiryId;
		this.type = type;
		this.source = source;
		this.desc = desc;
		this.enquiryDate = enquiryDate;
	}


	/**
	 * @return the enquiryId
	 */
	public Long getEnquiryId() {
		return enquiryId;
	}


	/**
	 *  enquiryId the enquiryId to set
	 */
	public void setEnquiryId(Long enquiryId) {
		this.enquiryId = enquiryId;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 *  type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}


	/**
	 *  source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
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


	/**
	 * @return the course
	 */
	public CourseDO getCourse() {
		return course;
	}


	/**
	 *  course the course to set
	 */
	public void setCourse(CourseDO course) {
		this.course = course;
	}


	/**
	 * @return the student
	 */
	public StudentDO getStudent() {
		return student;
	}

	/**
	 *  student the student to set
	 */
	public void setStudent(StudentDO student) {
		this.student = student;
	}

	/**
	 * @return the enquiryDate
	 */
	public Date getEnquiryDate() {
		return enquiryDate;
	}

	/**
	 * enquiryDate the enquiryDate to set
	 */
	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}

	
		
}
