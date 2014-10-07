package org.agile.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "user_location")
public class UserLocation implements Serializable {

	@Id
	@GeneratedValue
	@Column(name = "user_location_id")
	private int id;

	@Column(name = "user_id")
	private int user_id;
	
	@Column(name = "location_id")
	private int location_id;
	
	@Column(name = "primary_user")
	private int primary_user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public int getPrimary_user() {
		return primary_user;
	}

	public void setPrimary_user(int primary_user) {
		this.primary_user = primary_user;
	}

}
