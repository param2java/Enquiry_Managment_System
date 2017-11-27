package com.jrd.ems.service;

import javax.ws.rs.core.Response;

import com.jrd.ems.entity.UserLoginDO;
import com.jrd.ems.entity.UserRegistrationDO;
import com.jrd.ems.model.StudentDetails;

public interface UserService {

	
	public Response login(UserLoginDO login);
	public Response registration(UserRegistrationDO registration);
	public Response studentDetails(StudentDetails student);

}
