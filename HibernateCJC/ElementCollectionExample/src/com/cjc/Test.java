package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.HibernateUtil;

public class Test 
{
	
		
	public Student m1()
	{
	Student stu=new Student();

		Address addr1=new Address();
	
				addr1.setCityname("pune");
				addr1.setArea("vadgaon");

		Address addr2=new Address();
				
				addr2.setCityname("pune");
				addr2.setArea("bavdhan");

				
			stu.setRollno(2);
			stu.setName("pa");
			stu.setEmail("p@gmail.com");
			
			

				stu.getSaddr().add(addr1);
				stu.getSaddr().add(addr2);
				
				return stu;
	}
	
	public static void main(String[] args) 
	{
		Test t=new Test();
		
		Student st=t.m1();
		
		
		SessionFactory sf=HibernateUtil.getSessionFacory();	
		Session session=sf.openSession(); 
		
		System.out.println();
		session.save(st);
		session.beginTransaction().commit();
		
	}
}