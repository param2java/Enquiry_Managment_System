package com.jrd.ems.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jrd.ems.model.StudentDetails;
import com.jrd.ems.service.UserService;

@Component
@Path("student")
public class StudentResource {
	
	
	 @Autowired
     private UserService userService;
	 
	 @Autowired
     private EnquiryResource enquiryResource;
     
     
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)	
    public Response studentDetails(StudentDetails student) {
        return userService.studentDetails(student);
    }
	
	@Path("{studentId}/enquiry")
    public EnquiryResource getStudentEnquiry() {
    	
    	return enquiryResource;
    }
	
}
