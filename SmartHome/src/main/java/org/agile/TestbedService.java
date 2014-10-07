package org.agile;


import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import com.google.gson.*;


@Path("/testbed")

public class TestbedService {
	@GET
	@Path("/userlist")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserList() {
		ArrayList<User> userList = User.getUserList();
		Gson gson = new Gson();
		String jsonString = gson.toJson(userList);
		return Response.status(201).entity(jsonString).build(); 
	}
	@GET
	@Path("/sensor/getinfo/userid={user_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSensorStati() {
		//TODO Lookup for specific user info
		
		ArrayList<Sensor> sensorList = Sensor.getSensorStati();
		Gson gson = new Gson();
		String jsonString = gson.toJson(sensorList);
		return Response.status(201).entity(jsonString).build(); 
	}
	
	@GET
	@Path("/sensor/setinfo/userid={user_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response setSensorStati() {
		//TODO Logic to accept the Sensor info 
		return null;
	}
	
}
