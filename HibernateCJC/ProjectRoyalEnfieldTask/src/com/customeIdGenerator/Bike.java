package com.customeIdGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Bike
{
	

	@Id
	@GenericGenerator(name = "sequence_bike_id", strategy = "com.customeIdGenerator")
	@GeneratedValue(generator = "sequence_bike_id")  
	@Column(name="Bike_Id")
	private String bikeId;

	@Column(name="Bike_Name",unique=true,nullable=false)
	private String BikeName;


	/*@Column(name="Department_Description")
	//@NotNull
	private String deptDesc;*/
	


}
