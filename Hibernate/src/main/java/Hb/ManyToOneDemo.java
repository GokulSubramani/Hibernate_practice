package Hb;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ManyToOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address addr=new Address();
		addr.setAdd_id("N-1");
		addr.setAdd1("NEC");
		addr.setAdd2("Erode Road");
		addr.setStreet("Vaaikalmedu");
		
		Student_info std1=new Student_info();
		std1.setRollno("st-1");
		std1.setSt_name("abc");
		std1.setAdd(addr);
		
		Student_info std2=new Student_info();
		std2.setRollno("st-2");
		std2.setSt_name("def");
		std2.setAdd(addr);
		
		Configuration config = new Configuration();
        config.configure("Hb/sample.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(std1);
        session.persist(std2);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Success...");
		
		
	}

}
