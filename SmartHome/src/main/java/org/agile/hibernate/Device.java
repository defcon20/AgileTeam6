package org.agile.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "device_id")
	private int id;

	@Column(name = "device_name")
	private String device_name;

	@Column(name = "display_units")
	private String display_units;

	@Column(name = "data_type")
	private String data_type;

	@Column(name = "energy_consumed")
	private String energy_consumed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDevice_name() {
		return device_name;
	}

	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}

	public String getDisplay_units() {
		return display_units;
	}

	public void setDisplay_units(String display_units) {
		this.display_units = display_units;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public String getEnergy_consumed() {
		return energy_consumed;
	}

	public void setEnergy_consumed(String energy_consumed) {
		this.energy_consumed = energy_consumed;
	}

}
