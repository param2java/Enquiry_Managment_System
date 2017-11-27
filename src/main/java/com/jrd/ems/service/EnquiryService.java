package com.jrd.ems.service;

import java.util.List;

import javax.ws.rs.core.Response;

import com.jrd.ems.model.Enquiry;


public interface EnquiryService {

	public Response addEnquiry(Long studentId,Enquiry enquiry);
	
	public Enquiry editEnquiry(Long studentId, Long courseId,Enquiry enquiry);
 
	public Response deleteEnquiry(Long enquiryId);

	public List<Enquiry> searchEnquiryByName(String name);

	public List<Enquiry> getTodayEnquiries();


}
