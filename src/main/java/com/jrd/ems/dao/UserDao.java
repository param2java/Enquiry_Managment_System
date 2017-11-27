package com.jrd.ems.dao;

import com.jrd.ems.entity.StudentDO;
import com.jrd.ems.entity.UserLoginDO;
import com.jrd.ems.entity.UserRegistrationDO;


public interface UserDao {

	public UserRegistrationDO login(UserLoginDO login);
	public void registration(UserRegistrationDO registration);
	public void studentDetails(StudentDO student);
	
	public StudentDO getStudent(Long id);
	
}
