package com.join_table_inheritance;

import org.hibernate.Session;

public class Test 
{
	public static void main(String[] args) 
	{
		Session session=HibernateUtil.getSessionFacory().openSession();

		CjcAkurdi akurdi=new CjcAkurdi();
	
				  akurdi.setId(1);
				  akurdi.setSname("pandurang");
				  akurdi.setCource("java");
				  akurdi.setWeekendbatchno("w90");
				
		CjcKarvenagar karve=new CjcKarvenagar();
		              
					  karve.setId(2);
					  karve.setSname("sandip");
					  karve.setCource("java");
					  karve.setFulldaybatchno("B99");
				
					  
					  session.save(akurdi);
					  session.save(karve);
					  
			session.beginTransaction().commit();
				
  }
}
