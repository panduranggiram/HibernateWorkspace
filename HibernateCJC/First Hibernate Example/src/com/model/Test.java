package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration().configure();
				
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Student1 s1=new Student1();
		
			s1.setRollno(12);
			s1.setName("sandip");
			s1.setAddr("pune");
			
		Student1 s=new Student1();	
			s.setRollno(11);
			s.setName("san");
			s.setAddr("pune");
			
			session.save(s);
			session.save(s1);
			session.beginTransaction().commit();
	}
}
