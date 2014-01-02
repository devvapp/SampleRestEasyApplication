package org.devvapp.SampleRestEasyApplication;

import java.util.List;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

public class SResponse {

	public Response getResponse(String myList) {
		int status = 200;
		String type = MediaType.APPLICATION_XML;
		String response = "<hello>world</hello>";
		
		return Response.status(status).type(type).entity(myList).build();
	}

}
