package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.*;
public class Test {
	
	public static void main(String[] args) {
		
	SessionFactory sf=HibernateUtil.getSessionFacory();	
	Session session=sf.openSession();
	
	/*Student stu=session.get(Student.class, 10);
	
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr());*/
	
	Student s=new Student();
	s.setRollno(9);
	s.setName("nilesh");
	s.setAddr("vadgaon");
	session.save(s);
	session.beginTransaction().commit();		
		
	}

}
