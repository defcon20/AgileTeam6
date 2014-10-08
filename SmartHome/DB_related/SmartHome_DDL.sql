--User TABLE

create table User
(
	user_id int(3) NOT NULL AUTO_INCREMENT,
	user_name varchar(50),
	password varchar(50),
	phone_number varchar(50),
	email varchar(50),
	primary key (user_id)
);

--Location TABLE

create table Location
(
	location_id int(3) NOT NULL AUTO_INCREMENT,
	address1 varchar(60),
	address2 varchar(60),
	zip varchar(8),
	city varchar(20),
	state varchar(30),
	country varchar(30),
	primary key (location_id)
);

-- User_location TABLE

create table User_location
(
	user_location_id int(3) NOT NULL AUTO_INCREMENT, 
	user_id int(3) references user(id),
	location_id int(3) references location(id),
	primary_user int(1),
	primary key (user_location_id)
);

--Devices definition TABLE

create table device
(
	device_id int(3) NOT NULL AUTO_INCREMENT,
	device_name varchar(30),
	display_units varchar(10),
	data_type varchar(30),
	enerygy_consumed int(5),
	primary key (device_id)
);

--Devices_allocation TABLE

create table device_allocation
(
	device_allocation_id int(3) NOT NULL AUTO_INCREMENT,
	device_id int(3) references device(id),
	location_id int (3) references location(id),
	device_name varchar(50),
	device_description varchar(50),
	default_value varchar(50),
	current_value varchar(50),
	expected_value varchar(50),
	primary key (device_allocation_id)
);

--History TABLE

--Scheduling TABLE

--CONFIGURATIONS TABLE

create table configuration
(
	config_id int(3) NOT NULL AUTO_INCREMENT,
	config_key varchar(50),
	value varchar(50),
	primary key (config_id)
);

--Environment TABLE

create table environment
(
	env_id int(3) NOT NULL AUTO_INCREMENT,
	env_name varchar(50),
	value varchar(50),
	units varchar(50),
	start_date date,
	end_date date,
	primary key (env_id)
);