package org.agile;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("hello")

public class HelloWorldResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayhello(){
		return "hello";
	}
}

