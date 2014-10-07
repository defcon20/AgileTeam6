package org.agile.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "device_allocation")
public class DeviceAllocation implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "device_allocation_id")
	private int id;

	@Column(name = "device_id")
	private int device_id;
	
	@Column(name = "location_id")
	private int location_id;
	
	@Column(name = "default_value")
	private String default_value;
	
	@Column(name = "current_value")
	private String current_value;
	
	@Column(name = "expected_value")
	private String expected_value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getDefault_value() {
		return default_value;
	}

	public void setDefault_value(String default_value) {
		this.default_value = default_value;
	}

	public String getCurrent_value() {
		return current_value;
	}

	public void setCurrent_value(String current_value) {
		this.current_value = current_value;
	}

	public String getExpected_value() {
		return expected_value;
	}

	public void setExpected_value(String expected_value) {
		this.expected_value = expected_value;
	}
	

}
