package com.jrd.ems.dao;

import com.jrd.ems.entity.CourseDO;

public interface CourseDao {

	public CourseDO addCourse(CourseDO course);
	
	public CourseDO getCourseDetails(Long courseId);


}
