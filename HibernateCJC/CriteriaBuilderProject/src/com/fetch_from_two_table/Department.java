package com.fetch_from_two_table;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Department
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int did;
	
	private String dname;
	
	private Employee1 employee;
/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	   private List<Employee1> employees = new ArrayList<Employee1>();
	
	public List<Employee1> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee1> employees) {
		this.employees = employees;
	}*/

	public int getDid() {
		return did;
	}

	public Employee1 getEmployee() {
		return employee;
	}

	public void setEmployee(Employee1 employee) {
		this.employee = employee;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
