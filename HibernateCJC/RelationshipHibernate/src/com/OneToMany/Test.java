package com.OneToMany;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtil.getSessionFacory().openSession();
		
		 Department d=new Department();
					d.setDname("IT");
					
		Department d1=new Department();
					d1.setDname("comp");
		
		/*Employee e1=new Employee();
				 e1.setFname("Pandurang");
				 e1.setLname("Giram");
				 e1.setDesignation("Student");
				 e1.setDepartment(d);
				 
		Employee e2=new Employee();
				 e2.setFname("Nilesh");
				 e2.setLname("Tammewar");
				 e2.setDesignation("Manager");
				 e2.setDepartment(d1);
	*/
		Employee e3=new Employee();
				 e3.setFname("sujit");
				 e3.setLname("joshi");
				 e3.setDesignation("President");
				 e3.setDepartment(d1);
				 
				
				 	//d.getSetemp().add(e1);
				   //d.getSetemp().add(e2);
				  d1.getSetemp().add(e3);				
				 			//session.save(d);
				 			session.save(d1);
				 			session.beginTransaction().commit();
	}
}