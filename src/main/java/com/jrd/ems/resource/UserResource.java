package com.jrd.ems.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jrd.ems.entity.UserLoginDO;
import com.jrd.ems.entity.UserRegistrationDO;
import com.jrd.ems.service.UserService;

@Component
@Path("user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {


     @Autowired
     private UserService userService;
     


	@POST
	@Path("login")
    public Response userLogin(UserLoginDO userLogin) {
        return userService.login(userLogin);
    }
	

	@POST
	@Path("registration")
    public Response userRegistration(UserRegistrationDO registration) {		
		
        return userService.registration(registration);
        
    }
}
