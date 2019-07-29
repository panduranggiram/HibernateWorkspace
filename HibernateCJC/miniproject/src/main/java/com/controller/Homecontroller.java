package com.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Address;
import com.model.Contact;
import com.model.Login;
import com.model.Registration;
import com.model.Role;
import com.servicei.Servicei;
import com.serviceimpl.Serviceimpl;

@Controller
public class Homecontroller {
	
	@Autowired
	Servicei service;
@RequestMapping("/")
public String start()
{
	System.out.println("in start");
	return "home";
}

@RequestMapping("/register")
public String reg()
{
	System.out.println("in registration");
	return "registration";
}

@RequestMapping("/savedata1")
public String saveData(@ModelAttribute Registration r,@ModelAttribute Login l,@ModelAttribute Contact c,@ModelAttribute Role ro,@ModelAttribute Address a,Model model)
{
	Date dt=new Date();
    int d=dt.getDate();
    int m=dt.getMonth()+1;
    int y=dt.getYear()+1900;
    r.getContact();
    String today=d+"/"+m+"/"+y;
    System.out.println("Today : "+today);
    r.setDate(today);
    l.setRole(ro);
	r.setLogin(l);
	c.setAddress(a);
	r.setContact(c);
	System.out.println("in saveData controller");
	String user="user";
	int i=0;
	System.out.println("in save data");
	
	if(a.getCountry().equals("india"))
	{
		a.setCountry("india");
	}
	else if(a.getCountry().equals("usa"))
	{
		a.setCountry("usa");
	}
	else 
	{
		a.setCountry("srilanka");
	}
	System.out.println("fetching state---------"+r.getContact().getAddress().getCountry());
	//System.out.println(req.getParameter("state")+"  "+	req.getParameter("city"));
	c.setAddress(a);
	System.out.println("fetching mob--"+r.getContact().getMobile());
	r.setContact(c);

	int icount=service.getIdCount(r.getRegistrationId());
	icount++;
	user=user+Integer.toString(icount);
	System.out.println(user);
	r.setRegistrationId(user);
	service.saveData(r);
	String msg="data saved successfully";
	model.addAttribute("msg", msg);
	return "home";
}

}
