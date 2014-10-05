package org.agile;

import java.util.ArrayList;

public class User {
	private String userID;
	private String password;
	
	public User(){
		
	}
	public User(String user, String pass){
		userID = user;
		password = pass;
	}
	
	public void setUserID(String user){
		userID = user;
	}
	
	public void setPassword(String pass){
		password = pass;
	}
	
	public String getUserID(){
		return userID;
	}
	
	public String getPassword(){
		return password;
	}
	
	public static ArrayList<User> getUserList(){
		//TODO Add logic to get a userList
		ArrayList<User> list = new ArrayList<User>();
		list.add(new User("test", "1234"));
		return list;
	}
	public static boolean checkCreds(String username, String password){
		//TODO Add logic for accessing DB
		return true;
	}
}
