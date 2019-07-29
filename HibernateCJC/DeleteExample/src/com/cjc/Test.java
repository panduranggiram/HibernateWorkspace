package com.cjc;

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
	
	Student stu=session.get(Student.class,1);
	
	session.delete(stu);
	session.beginTransaction().commit();		
		
	}

}
