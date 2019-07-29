package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.service.ServiceInterface;
import com.serviceimplement.ServiceImple;
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		System.out.println("Register Controller");
		
		Employee e=new Employee();
		
	    System.out.println(req.getParameter("name"));	
	
		e.setName(req.getParameter("name"));
		e.setCity(req.getParameter("city"));
		e.setDept(req.getParameter("dept"));
		e.setUname(req.getParameter("uname"));
		e.setPass(req.getParameter("pass"));
		
		
		//si.saveData(e);
		
		System.out.println(e);
		
		ServiceInterface si=new ServiceImple();
		int id=si.RegisterData(e);
		
		/*
		if(id!=0)
		{
			req.setAttribute("msg","Data Saved..!");
			req.getRequestDispatcher("login.jsp").forward(req, res);
		}*/
		
	}
}
