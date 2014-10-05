package org.agile;

public abstract class SmartObject {
	private int id;
	private String displayName;
	private String status;
	
	public SmartObject(){
		
	}
	
	public int getId(){
		return id;
	}
	public String getDisplayName(){
		return displayName;
	}
	public String getStatus(){
		return status;
	}
	
	public void setID(int ident){
		id = ident;
	}
	public void setDisplayName(String disp){
		displayName = disp;
	}
	public void setStatus(String stat){
		status = stat;
	}
}
