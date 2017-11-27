package com.jrd.ems.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jrd.ems.model.Course;
import com.jrd.ems.service.CourseService;


@Component
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
public class CourseResource {
	
	
	@Autowired
	public CourseService courseService;

	
	@POST
	public Response addEnquiryCourse(@PathParam("studentId") Long studentId,
			@PathParam("enquiryId") Long enquiryId, Course course) {
		return courseService.addCourse(studentId, enquiryId, course);
	}
}