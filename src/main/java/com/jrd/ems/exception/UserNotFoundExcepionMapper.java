package com.jrd.ems.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.jrd.ems.model.ErrorMessage;


@Provider
public class UserNotFoundExcepionMapper implements ExceptionMapper<UserNotFoundException> {
	
	@Override
	public Response toResponse(UserNotFoundException une) {
		 ErrorMessage errorMsg= new ErrorMessage(une.getMessage(), 404);
		 return Response.status(Status.NOT_FOUND).entity(errorMsg).build();
		
		
	}

}
