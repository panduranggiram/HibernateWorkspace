package com.storeprocedure;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;


import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtil.getSessionFacory().openSession();
		Student s=new Student();
				s.setName("ppg");
				
		Student s1=new Student();
				s1.setName("sandip");
				
     	     Phone p=new Phone();	 
     	     	   p.setPhonenumber(969696);
			       p.setStud(s);
		 
		     Phone  p1=new Phone();
		 	       	p1.setPhonenumber(959595);
		 		    p1.setStud(s);
		 		
		     Phone p2=new Phone();
		 		   p2.setPhonenumber(929292);
		 		   p2.setStud(s1);
		 		
		     Phone p3=new Phone();
		 	       p3.setPhonenumber(919191);
		 		   p3.setStud(s1);
		 		
		 		
		 		s.getSetphone().add(p);
		 		s.getSetphone().add(p1);
		 		s.getSetphone().add(p2);
		 		s.getSetphone().add(p3);
		 		
		      /*
				StoredProcedureQuery spq=session.createStoredProcedureQuery("");
				spq.registerStoredProcedureParameter("pid",Integer.class,ParameterMode.IN);
				spq.registerStoredProcedureParameter("phone",Integer.class,ParameterMode.IN);
				spq=setpar
				
			 */
		 		session.save(s);
		 		session.beginTransaction().commit();
	}
}
