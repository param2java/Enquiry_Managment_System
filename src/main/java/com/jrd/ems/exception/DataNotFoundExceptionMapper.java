package com.jrd.ems.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.jrd.ems.model.ErrorMessage;




@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {
	
	@Override
	public Response toResponse(DataNotFoundException dne) {
		 ErrorMessage errorMsg= new ErrorMessage(dne.getMessage(), 404);
		 return Response.status(Status.NOT_FOUND).entity(errorMsg).build();
		
		
	}

}
