package Hb;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class ConnectionMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>grp_name=new ArrayList<String>();
		grp_name.add("Telecom: Idea");
		grp_name.add("Clothes : Allen Soley");
		grp_name.add("Steel : TMT");
		
		Groups gr=new Groups();
		gr.setGrp_id("g-1");
		gr.setGrp_name("Aditiya Grps");
		gr.setGrps(grp_name);
		
		Configuration con=new Configuration();
		con.configure("Hb/sample.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction t=ses.beginTransaction();
		ses.persist(gr);
		
		t.commit();
		ses.close();
		sf.close();
		
		System.out.print("Success...");
		
	}

}
