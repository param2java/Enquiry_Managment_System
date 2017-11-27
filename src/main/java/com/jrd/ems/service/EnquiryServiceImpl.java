package com.jrd.ems.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.ems.dao.CourseDao;
import com.jrd.ems.dao.EnquiryDao;
import com.jrd.ems.dao.UserDao;
import com.jrd.ems.entity.CourseDO;
import com.jrd.ems.entity.EnquiryDO;
import com.jrd.ems.entity.StudentDO;
import com.jrd.ems.exception.DataNotFoundException;
import com.jrd.ems.model.Course;
import com.jrd.ems.model.Enquiry;
import com.jrd.ems.model.SuccessMessage;



@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryDao enquiryDao;

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private CourseDao courseDao;

	@Override
	@Transactional
	public Response addEnquiry(Long studentId,Enquiry enquiry) {
		 SuccessMessage msg= new SuccessMessage("Enquiry Created Successfully", 200);
	     Response response = Response.status(Status.OK).entity(msg).build();
		
		StudentDO student = userDao.getStudent(studentId);
		EnquiryDO enquiryDO = transformEnquiryToEnquiryDO(enquiry);
		if (student == null) {
			throw new DataNotFoundException("Student Not Found");
		}
		enquiryDO.setStudent(student);
		enquiryDao.addEnquiry(enquiryDO);
		return response;
	}

	@Override
	@Transactional
	public Enquiry editEnquiry(Long studentId, Long enquiryId, Enquiry enquiry) {

		EnquiryDO enquiryDO = transformEnquiryToEnquiryDO(enquiry);		
		StudentDO student = userDao.getStudent(studentId);
		if (student == null) {
			throw new DataNotFoundException("Student Not Found");
		}

	    enquiryDO.setStudent(student);
		enquiryDO = enquiryDao.editEnquiry(enquiryDO);
		enquiry = transformEnquiryDOToEnquiry(enquiryDO);

		return enquiry;
	}

	@Override
	@Transactional
	public Response deleteEnquiry(Long enquiryId) {

		 SuccessMessage msg= new SuccessMessage("Enquiry Deleted Successfully", 200);
	     Response response = Response.status(Status.OK).entity(msg).build();

		EnquiryDO enquiryDO = enquiryDao.getEnquiry(enquiryId);

		if (enquiryDO == null) {
			throw new DataNotFoundException("Enquiry id:+"+enquiryId+"Not Found");
		}

		enquiryDao.deleteEnquiry(enquiryDO);
         return response;
	}

	@Override
	@Transactional
	public List<Enquiry> searchEnquiryByName(String name) {
		List<EnquiryDO> enquiryList = enquiryDao.searchEnquiryByName(name);
		List<Enquiry> enqList = new ArrayList<Enquiry>();

		for (EnquiryDO enquiry : enquiryList) {

			enqList.add(transformEnquiryDOToEnquiry(enquiry));
		}
		return enqList;

	}
	
	@Override
	public List<Enquiry> getTodayEnquiries() {

		List<EnquiryDO> enqDOList = enquiryDao.getTodayEnquiries();
		List<Enquiry> enqList = new ArrayList<Enquiry>();
		for (EnquiryDO enqDo : enqDOList) {
			enqList.add(transformEnquiryDOToEnquiry(enqDo));
		}
		return enqList;
	}


	
	private EnquiryDO transformEnquiryToEnquiryDO(Enquiry enquiry) {

		EnquiryDO enquiryDO = new EnquiryDO();
		enquiryDO.setEnquiryId(enquiry.getEnquiryId());
		enquiryDO.setType(enquiry.getType());
		enquiryDO.setSource(enquiry.getSource());
		enquiryDO.setDesc(enquiry.getDesc());
		enquiryDO.setEnquiryDate(new Date());
		return enquiryDO;
	}

	private Enquiry transformEnquiryDOToEnquiry(EnquiryDO enquiryDO) {

		Enquiry enquiry = new Enquiry();
		enquiry.setEnquiryId(enquiryDO.getEnquiryId());
		enquiry.setType(enquiryDO.getType());
		enquiry.setSource(enquiryDO.getSource());
		enquiry.setDesc(enquiryDO.getDesc());
		enquiry.setEnquiryDate(enquiryDO.getEnquiryDate());
		if(null != enquiryDO.getCourse()){
		enquiry.setCourse(transformCourseDOToCourse(enquiryDO.getCourse()));
		}
		return enquiry;
	}

	private Course transformCourseDOToCourse(CourseDO courseDO) {
		Course course = new Course();
		course.setCourseId(courseDO.getCourseId());
		course.setCourseName(courseDO.getCourseName());
		course.setCourseType(courseDO.getCourseType());
		course.setDuration(courseDO.getDuration());
		course.setAmount(courseDO.getAmount());
		course.setDesc(courseDO.getDesc());
		return course;
	}

	
}
