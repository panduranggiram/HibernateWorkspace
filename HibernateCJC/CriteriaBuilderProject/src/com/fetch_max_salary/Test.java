package com.fetch_max_salary;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		/*Employee e1 = new Employee();
		e1.setEname("sandip");
		e1.setAge(25);
		e1.setSalary(45000);

		Employee e2 = new Employee();
		e2.setEname("nilesh");
		e2.setAge(23);
		e2.setSalary(50000);

		Employee e3 = new Employee();
		e3.setEname("nikita");
		e3.setAge(24);
		e3.setSalary(55000);

			
				session.save(e1);
				session.save(e2);
				session.save(e3);

				session.beginTransaction().commit();
			*/	
				
				
		Session session = HibernateUtil.getSessionFacory().openSession();
						
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		
		CriteriaQuery query=builder.createQuery(Integer.class);
		
		Root<Employee> root=query.from(Employee.class);
		
			            query.select(builder.max(root.get("salary")));
			
			Query q=session.createQuery(query);
			
			
			Integer sal=(Integer)q.getSingleResult();
			
			
			
			System.out.println("Max_Salary= "+sal);
				
			
	}
}
