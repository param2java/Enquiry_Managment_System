package com.jrd.ems.service;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.ems.dao.UserDao;
import com.jrd.ems.entity.StudentDO;
import com.jrd.ems.entity.UserLoginDO;
import com.jrd.ems.entity.UserRegistrationDO;
import com.jrd.ems.model.StudentDetails;
import com.jrd.ems.model.SuccessMessage;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
	
	
	@Override
	@Transactional
	public Response login(UserLoginDO login) {
		SuccessMessage msg= new SuccessMessage("User Login Successfully", 200);
		UserLoginDO loginDO = new UserLoginDO();
		loginDO.setUserId(login.getUserId());
		loginDO.setPassword(login.getPassword());
		
		UserRegistrationDO resp = userDao.login(loginDO);
		
		Response response=null;
		if(resp != null){
			if( resp.getLogin().getUserId().equals(login.getUserId())	
				&& resp.getLogin().getPassword().equals(login.getPassword()))	
	     response = Response.status(Status.OK).entity(msg).build();
		}
		return response;		
				
	}

	@Override
	@Transactional
	public Response registration(UserRegistrationDO registration) {
		
		SuccessMessage msg= new SuccessMessage("User Registered Successfully", 200);
	     Response response = Response.status(Status.OK).entity(msg).build();

			UserRegistrationDO regDO = new UserRegistrationDO();
			UserLoginDO loginDO = new UserLoginDO();			
			regDO.setUserId(registration.getUserId());
			regDO.setPassword(registration.getPassword());
			regDO.setConfirmPassword(registration.getConfirmPassword());
			regDO.setEmail(registration.getEmail());
			loginDO.setUserId(registration.getUserId());
			loginDO.setPassword(registration.getPassword());
			regDO.setLogin(loginDO);
			userDao.registration(regDO);
			return response;
		 
		
		
		
	}

	@Override
	@Transactional
	public Response studentDetails(StudentDetails student) {		
	
		SuccessMessage msg= new SuccessMessage("Student Details Successfully", 200);
	     Response response = Response.status(Status.OK).entity(msg).build();

		StudentDO studentDO = new StudentDO();
		studentDO.setFirstName(student.getFirstName());
		studentDO.setLastName(student.getLastName());
		studentDO.setPhoneNo(student.getPhoneNo());
		studentDO.setAddress(student.getAddress());
		studentDO.setDob(student.getDob());
		studentDO.setComments(student.getComments());		
		 userDao.studentDetails(studentDO);
		 
		 return response;
	}


}
