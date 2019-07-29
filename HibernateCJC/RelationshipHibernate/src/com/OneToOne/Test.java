package com.OneToOne;
import org.hibernate.Session;
public class Test
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtil.getSessionFacory().openSession();
		
		Account ac=new Account();
				ac.setFname("sandeep");
				ac.setLname("rathod");
				
				
		AccountPlus acp1=new AccountPlus();
					acp1.setEmail("abc@gmail.com");
					acp1.setAmnt(500);
					acp1.setAc1(ac);
					
					ac.setAcp(acp1);
		
			session.save(ac);
			session.beginTransaction().commit();
					
	}
}
