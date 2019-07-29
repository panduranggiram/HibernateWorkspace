package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	
	public static void main(String[] args) {
		
	SessionFactory sf=HibernateUtil.getSessionFacory();	
	Session session=sf.openSession();
	
	Student s=new Student();
	s.setRollno(6);
	s.setName("manoj");
	s.setAddr("mumbai");
	session.save(s);
	session.beginTransaction().commit();
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
