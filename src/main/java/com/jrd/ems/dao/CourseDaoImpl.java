package com.jrd.ems.dao;

import org.springframework.stereotype.Repository;

import com.jrd.ems.entity.CourseDO;

@Repository
public class CourseDaoImpl extends GenericDAO implements CourseDao {

	@Override
	public CourseDO addCourse(CourseDO course) {
		return getEntityManager().merge(course);

		// return "success";
	}

	@Override
	public CourseDO getCourseDetails(Long courseId) {

		return getEntityManager().find(CourseDO.class, courseId);
	}

}
