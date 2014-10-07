package org.agile;

import java.util.ArrayList;

public class Sensor extends SmartObject {

	public Sensor(int ident, String disp, String stat) {
		id = ident;
		displayName = disp;
		status = stat;
	}
	
	public static ArrayList<Sensor> getSensorStati() {
		// TODO Add logic to get a userList
		ArrayList<Sensor> list = new ArrayList<Sensor>();
		list.add(new Sensor(1, "One Test", "False"));
		list.add(new Sensor(2, "Two Test", "False"));
		list.add(new Sensor(3, "Three Test", "True"));
		return list;
	}
}