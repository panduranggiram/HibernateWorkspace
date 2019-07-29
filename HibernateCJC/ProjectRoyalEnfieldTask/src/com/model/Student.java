package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
 class Student1 
{
	@Id
	private String rollno;
	private String name;
	private String addr;
	
	
	public String getName() {
		return name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
