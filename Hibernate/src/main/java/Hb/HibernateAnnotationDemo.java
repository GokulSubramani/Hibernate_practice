package Hb;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class HibernateAnnotationDemo {

	public static void main(String[] args) {
		  library lib = new library();
	        lib.setLib_id("lib-02");
	        lib.setLib_name("NCT");
	        lib.setTotal_books(500);

	        Configuration config = new Configuration();
	        config.configure("Hb/sample.cfg.xml");

	        SessionFactory sessionFactory = config.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();

	        session.persist(lib);

	        transaction.commit();
	        session.close();
	        sessionFactory.close();

	        System.out.println("Success...");

	}

}
