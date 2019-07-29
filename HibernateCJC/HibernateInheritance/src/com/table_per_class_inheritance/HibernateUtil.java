package com.table_per_class_inheritance;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateUtil {	
private static StandardServiceRegistry registry;
private static SessionFactory sf;
	public static SessionFactory getSessionFacory()
	{
		Map<String, Object> setting=new HashMap<String, Object>();
		setting.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		setting.put(Environment.URL, "jdbc:mysql://localhost:3306/table_per_class_inheritance");
		setting.put(Environment.USER, "root");
		setting.put(Environment.PASS, "root");
		setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
	  //setting.put("hbm2ddl.auto", "update");
	  //setting.put(Environment.HBM2DDL_AUTO,"update");
		setting.put("hibernate.hbm2ddl.auto", "update");
		setting.put(Environment.SHOW_SQL, "true");
		registry=new StandardServiceRegistryBuilder().applySettings(setting ).build();
		
		MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(CjcAkurdi.class).addAnnotatedClass(CjcKarvenagar.class);
		
		Metadata md=mds.getMetadataBuilder().build();
	    sf=md.getSessionFactoryBuilder().build();
		return sf;	
	}
}
