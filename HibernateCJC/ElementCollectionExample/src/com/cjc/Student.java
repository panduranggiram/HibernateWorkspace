package com.cjc;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="student_detail")
public class Student 
{
	@Id
	private int rollno;
	private String name;
	private String email;
	
	@ElementCollection
	@JoinTable (name="address",joinColumns=@JoinColumn(name="roll_no"))
	private Set<Address> saddr=new HashSet<Address>();
	
	
	public Set<Address> getSaddr() {
		return saddr;
	}

	public void setSaddr(Set<Address> saddr) {
		this.saddr = saddr;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}
