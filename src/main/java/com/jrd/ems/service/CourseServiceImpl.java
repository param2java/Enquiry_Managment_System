package com.jrd.ems.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.ems.dao.CourseDao;
import com.jrd.ems.dao.EnquiryDao;
import com.jrd.ems.entity.CourseDO;
import com.jrd.ems.entity.EnquiryDO;
import com.jrd.ems.model.Course;
import com.jrd.ems.model.SuccessMessage;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Autowired
	private EnquiryDao enquiryDao;	
		
		
		@Override
		@Transactional
		public Response addCourse(Course course) {
			SuccessMessage msg= new SuccessMessage("Course added Successfully", 200);
		     Response response = Response.status(Status.OK).entity(msg).build();

			CourseDO courseDO = transformCourseToCourseDO(course);
			 courseDao.addCourse(courseDO);
			return response;
		}




		private CourseDO transformCourseToCourseDO(Course course) {
			CourseDO courseDO = new CourseDO();
			courseDO.setCourseName(course.getCourseName());
			courseDO.setCourseType(course.getCourseType());
			courseDO.setDuration(course.getDuration());
			courseDO.setAmount(course.getAmount());
			courseDO.setDesc(course.getDesc());
			return courseDO;
		}




		@Override
		@Transactional
		public Response addCourse(Long studentId, Long enquiryId, Course course) {
			SuccessMessage msg= new SuccessMessage("Course added Successfully", 200);
		     Response response = Response.status(Status.OK).entity(msg).build();

			EnquiryDO  enquiryDO =enquiryDao.getEnquiry(enquiryId);			
			CourseDO courseDO =courseDao.addCourse(transformCourseToCourseDO(course));
			enquiryDO.setCourse(courseDO);			

			enquiryDao.editEnquiry(enquiryDO);
			return response;
		}
	

}
