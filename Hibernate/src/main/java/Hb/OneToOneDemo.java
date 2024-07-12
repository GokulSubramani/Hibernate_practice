package Hb;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class OneToOneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CTransaction t1=new CTransaction();
		t1.setTrans_id("T-1");
		t1.setProd_name("Laptop");
		t1.setQty(1);
		t1.setTotal(50000);
		
		Customer cust=new Customer();
		cust.setCus_id("C-1");
		cust.setCus_name("Gokul");
		cust.setCus_email("gokul@gmail.com");
		cust.setTrans(t1);
		
		Configuration config = new Configuration();
        config.configure("Hb/sample.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(cust);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Success...");
		

	}

}
