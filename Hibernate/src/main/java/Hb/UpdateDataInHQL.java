package Hb;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class UpdateDataInHQL {
	
	
	
	public static void main(String[] args) {
		
		Configuration config = new Configuration();
        config.configure("Hb/sample.cfg.xml");

        SessionFactory sf = config.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();

        
	}

}
