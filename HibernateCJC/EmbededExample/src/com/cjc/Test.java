package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.HibernateUtil;

public class Test 
{
	
		
	public Student m1()
	{
	Student stu=new Student();
	
			stu.setRollno(1);
			stu.setName("nilesh");
			stu.setEmail("abc@gmail.com");
			
			
		Address addr=new Address();
		
				addr.setCityname("pune");
				addr.setArea("karvenagar");

				stu.setAddress(addr);
				
				
				return stu;
	}
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		
		Student st=t.m1();
		
		
		SessionFactory sf=HibernateUtil.getSessionFacory();	
		Session session=sf.openSession(); 
		
		
		session.save(st);
		session.beginTransaction().commit();
		
	}
}