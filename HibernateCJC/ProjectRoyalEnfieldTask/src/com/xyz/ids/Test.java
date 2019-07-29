package com.xyz.ids;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtil.getSessionFacory().openSession();

		Department d1=new Department();
	
				  d1.setDeptName("COMP");
				  d1.setDeptDesc("computer dept");
				
				     Department d2=new Department();
				  				d2.setDeptName("IT");
				  				d2.setDeptDesc("IT dept");
					  
					  session.save(d1);
					  session.save(d2);
					  
			session.beginTransaction().commit();
				
  }
}
