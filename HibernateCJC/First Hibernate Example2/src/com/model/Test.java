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
		
		
		Teacher t1=new Teacher();
				t1.setTname("rahul");
		
		Teacher t2=new Teacher();
				t2.setTname("avinash");
				
		Student s1=new Student();
		
			
			s1.setName("vijay");
			s1.setAddr("pune");
			s1.setTeacher(t1);
		Student s=new Student();	
		
			s.setName("akash");
			s.setAddr("selu");
			s.setTeacher(t2);
		
		
				
			
			session.save(s);
			session.save(s1);
			session.beginTransaction().commit();
			
	}
}
