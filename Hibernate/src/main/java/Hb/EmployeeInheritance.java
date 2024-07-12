package Hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeInheritance {

	public static void main(String[] args) {

		
		Contract ct=new Contract(); 
		ct.setEmp_id("em-1"); 
		ct.setEmp_name("abc");
		ct.setHr_rate(200.00); 
		ct.setIncentive(500.00);
		  
		  
		  
		 Permanent pt=new Permanent();
		 pt.setEmp_id("em-2");
		 pt.setEmp_name("def");
		 pt.setBonus(2000.00);
		 pt.setSalary(50000.00);
		  
		 
		Employee em = new Employee();
		em.setEmp_id("em-3");
		em.setEmp_name("ghi");

		Configuration con = new Configuration();
		con.configure("Hb/sample.cfg.xml");

		SessionFactory sf = con.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction t = ses.beginTransaction();
		
		ses.persist(ct); 

		ses.persist(pt); 

		ses.persist(em);

		t.commit();
		ses.close();
		sf.close();
		System.out.print("Success.......");

	}

}
