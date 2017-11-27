package com.jrd.ems.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Enquiry {
	

	private Long enquiryId;	
	private String type;	
	private String source;	
	private String desc;	
	private Date enquiryDate;	
    private Course course;
	private List<Link> links= new ArrayList<Link>();

	
	public Enquiry(){
		
	}


	/**
	 *  enquiryId
	 *  type
	 *  source
	 *  desc
	 *  enquiryDate
	 */
	public Enquiry(Long enquiryId, String type, String source, String desc,
			Date enquiryDate) {
		super();
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
	 * @return the enquiryDate
	 */
	public Date getEnquiryDate() {
		return enquiryDate;
	}


	/**
	 *  enquiryDate the enquiryDate to set
	 */
	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}


	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}


	/**
	 *  course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}


	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}


	/**
	 *  links the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}



	
	public void addLinks(String url,String rel){
		Link link = new Link();
		
		link.setLink(url);
		link.setRel(rel);
		
		links.add(link);
		
	}

	
	
	
}
