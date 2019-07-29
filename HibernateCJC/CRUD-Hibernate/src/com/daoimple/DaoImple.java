package com.daoimple;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;


import com.dao.DaoInterface;
import com.model.Employee;
import com.utility.HibernateUtil;

public class DaoImple implements DaoInterface
{
	Session session=HibernateUtil.getSessionFacory().openSession();
	
	
	@Override
	public int RegisterData(Employee e)
	{
		System.out.println("in dao register data");
	
	  int i=(int) session.save(e);
	  return i;
	}

/*	@Override
	public int ValidUser(String un, String ps) 
	{
		
   Query query= session.createQuery("from Employee where uname='"+un+"' and pass='"+ps+"'");
		
   
   Employee e=(Employee)query.getSingleResult();
   
		if(e==null)
		{
			return 0;
		}

		else
		{
			return 1;
		}
	}
	
	
	@Override
	public List<Employee> getAllRecord() 
	{

		Query q=session.createQuery("from employee");
		return q.getResultList();
	}
*/
	/*@Override
	public void saveData(Employee e) {
		
		System.out.println("in daoimpl savedata ");
		session.save(e);
	}
*/
	


}
