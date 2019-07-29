package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daoi.Daoilogin;
import com.daoi.Daoiregistration;
import com.model.Registration;
import com.servicei.Servicei;
@Service
public class Serviceimpl implements Servicei{
	@Autowired
	Daoiregistration di;
	@Autowired
	Daoiregistration daoregister;
	
	public Registration saveData(Registration r)
	{
		return di.save(r);
	}

	@Override
	public int getIdCount(String id) {
		// TODO Auto-generated method stub
		int result=(int) di.count();
		System.out.println("In getIdCount().....result---"+result);
		return result;
	}
}
