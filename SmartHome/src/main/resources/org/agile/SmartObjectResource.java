package org.agile;

import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/")
public class SmartObjectResource {
	@GET
	@Path("/testbed/userlist")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<User> getUserList(){
		ArrayList<User> userList = User.getUserList();
		return userList;
	}
	
	@GET
	@Path("/ui/login/uid={userID}&&pwd={password}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean login(@PathParam("userID") String userID, @PathParam("password") String password){
		boolean loginSuccess = User.checkCreds(userID, password);
		return loginSuccess;
	}
	
}
