package org.agile;

public abstract class SmartObject {
	protected int id;
	protected String displayName;
	protected String status;

	public SmartObject(int ident, String disp, String stat) {
		id = ident;
		displayName = disp;
		status = stat;
	}
	public SmartObject() {

	}

	public int getId() {
		return id;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getStatus() {
		return status;
	}

	public void setID(int ident) {
		id = ident;
	}

	public void setDisplayName(String disp) {
		displayName = disp;
	}

	public void setStatus(String stat) {
		status = stat;
	}
}	