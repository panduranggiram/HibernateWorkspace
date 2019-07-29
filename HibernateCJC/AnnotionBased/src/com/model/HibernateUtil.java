package com.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil{
	
private static	StandardServiceRegistry registry;
private static SessionFactory sf;
	public static SessionFactory getSessionFacory()
	{
		
registry=new StandardServiceRegistryBuilder().configure().build();
		
		MetadataSources mds=new MetadataSources(registry);
		
		Metadata md=mds.getMetadataBuilder().build();
		
	sf=md.getSessionFactoryBuilder().build();
	
		
		return sf;
		
	}

}
