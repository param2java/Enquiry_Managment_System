package com.jrd.ems.service;

import javax.ws.rs.core.Response;

import com.jrd.ems.model.Course;


public interface CourseService {

	public Response addCourse(Course course);

	public Response addCourse(Long studentId, Long enquiryId, Course course);

}
