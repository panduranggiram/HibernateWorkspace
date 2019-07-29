package com.fetch_from_two_table;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		
		  Session session = HibernateUtil.getSessionFacory().openSession();

		
		
		Department d1=new Department();
					d1.setDname("COMP");
					
	  Department d2=new Department();
	  			 d2.setDname("IT");
		
		  Employee1 e1 = new Employee1(); e1.setEname("sandip"); e1.setAge(25);
		  e1.setSalary(45000);e1.setDepartment(d1);
		  
		  Employee1 e2 = new Employee1(); e2.setEname("nilesh"); e2.setAge(23);
		  e2.setSalary(50000);e2.setDepartment(d2);
		  
		  Employee1 e3 = new Employee1(); e3.setEname("nikita"); e3.setAge(24);
		  e3.setSalary(55000);e3.setDepartment(d1);
		  
		  
		  /*Department d3=new Department();
		  */ 			
		   			
		   			
		   			
		   			
		   			
		   			
				  session.save(e1); session.save(e2); session.save(e3);
		  
		  session.beginTransaction().commit();
		 

		

		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery query = builder.createQuery(Object.class);

		Root<Department> deptroot = query.from(Department.class);
		Root<Employee1> emproot = query.from(Employee1.class);

		query.multiselect(emproot,deptroot);
		query.where(builder.equals(emproot.get("department"));

		Query q = session.createQuery(query);

		List<Object[]> list = q.getResultList();

		System.out.println("Ename\tsalary");
		for (Object[] x : list)

		{
			Employee1 e5=(Employee1)x[0];
			
			Department d5=(Department)x[1];
			
			System.out.println(e5+"\t"+d5);
		}

	}
}
