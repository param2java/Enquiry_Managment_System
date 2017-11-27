package com.jrd.ems.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jrd.ems.model.Enquiry;
import com.jrd.ems.service.EnquiryService;

@Component
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EnquiryResource {

   @Autowired
   EnquiryService enquiryService;
   
   @Autowired
   CourseResource courseResource;

	@GET
	public List<Enquiry> getEnquiryByName(@QueryParam("name") String name) {
		return enquiryService.searchEnquiryByName(name);
	}

	@GET
	@Path("/today")
	public List<Enquiry> todayEnquiries(@PathParam("studentId") Long studentId,@Context UriInfo uriInfo) {
		List<Enquiry> enquiries = enquiryService.getTodayEnquiries();
		for(Enquiry enquiry:enquiries){
			enquiry.addLinks(getURLForSelf(uriInfo, studentId,enquiry), "self");
			enquiry.addLinks(getURLForCourse(uriInfo, studentId,enquiry), "course");
		}
    	return enquiries;
	}
   private String getURLForCourse(UriInfo uriInfo, Long studentId,Enquiry enquiry) {
		
		String url = uriInfo.getBaseUriBuilder()
				.path(StudentResource.class)
				.path(StudentResource.class,"getStudentEnquiry")
				.resolveTemplate("studentId", studentId)
				.path(EnquiryResource.class)
                .path(EnquiryResource.class,"getEnquiryCourse")
                .resolveTemplate("enquiryId", enquiry.getEnquiryId())
				.path(CourseResource.class)
			    .path(Long.toString(enquiry.getCourse().getCourseId()))

    			.build().toString();
		return url;
	}

	private String getURLForSelf(UriInfo uriInfo,Long studentId, Enquiry enquiry) {
		String url = uriInfo.getBaseUriBuilder()
				.path(StudentResource.class)
				.path(StudentResource.class,"getStudentEnquiry")
				.resolveTemplate("studentId", studentId)
				.path(EnquiryResource.class).
    			path(Long.toString(enquiry.getEnquiryId())).build().toString();
		return url;
	}
	
	
	@POST
	public Response addEnquiry(@PathParam("studentId") Long studentId,
			 Enquiry enquiry) {
		return enquiryService.addEnquiry(studentId,enquiry);
	}

	@PUT
	@Path("{enquiryId}")
	public Enquiry editEnquiry(@PathParam("studentId") Long studentId,
			@PathParam("enquiryId") Long enquiryId, Enquiry enquiry) {
		enquiry.setEnquiryId(enquiryId);
		return enquiryService.editEnquiry(studentId, enquiryId, enquiry);
	}

	@DELETE
	@Path("{enquiryId}")
	public Response deleteEnquiry(@PathParam("studentId") Long studentId,
			@PathParam("enquiryId") Long enquiryId) {

		return enquiryService.deleteEnquiry(enquiryId);
	}

	@Path("{enquiryId}/course")
    public CourseResource getEnquiryCourse() {
    	
    	return courseResource;
    }

}
