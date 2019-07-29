package com.serviceimplement;

import java.util.List;

import org.hibernate.service.Service;

import com.dao.DaoInterface;
import com.daoimple.DaoImple;
import com.model.Employee;
import com.service.ServiceInterface;

public class ServiceImple implements ServiceInterface
{
	DaoInterface d=new DaoImple();
	
	
	@Override
	public int RegisterData(Employee e) 
	{
		System.out.println("in service register data");
		return d.RegisterData(e);
	}

	/*@Override
	public int ValidUser(String un, String ps) {
		
		return d.ValidUser(un, ps);
	}

	@Override
	public List<Employee> getAllRecord() {
		// TODO Auto-generated method stub
		return null;
	}*/

	/*@Override
	public void saveData(Employee e) {
		
		System.out.println("in serviceimpl savedata ");
		d.saveData(e);
		
	}*/
	

}


	
