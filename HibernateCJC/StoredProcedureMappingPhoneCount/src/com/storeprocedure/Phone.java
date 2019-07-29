package com.storeprocedure;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;

@SuppressWarnings("unused")
@Entity
public class Phone 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private int phonenumber;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Student stud;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
}
