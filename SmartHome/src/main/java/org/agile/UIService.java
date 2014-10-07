package org.agile;


import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import com.google.gson.Gson;

@Path("/ui")

public class UIService {
	@GET
	@Path("/login/uid={userID}&&pwd={password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@PathParam("userID") String userID,
			@PathParam("password") String password) {
		boolean loginSuccess = User.checkCreds(userID, password);
		Gson gson = new Gson();
		String jsonString = gson.toJson(loginSuccess);
		return Response.status(201).entity(jsonString).build(); 
	}
	
	@GET
	@Path("/alarm/status/{user_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkAlarm(@PathParam("userID") String userID) {
		boolean alarmStatus = Alarm.check(userID);
		Gson gson = new Gson();
		String jsonString = gson.toJson(alarmStatus);
		return Response.status(201).entity(jsonString).build(); 
	}
	
	@GET
	@Path("/alarm/suppress/{user_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response suppressAlarm(@PathParam("userID") String userID) {
		boolean alarmStatus = Alarm.suppress(userID);
		Gson gson = new Gson();
		String jsonString = gson.toJson(alarmStatus);
		return Response.status(201).entity(jsonString).build(); 
	}
	
}
