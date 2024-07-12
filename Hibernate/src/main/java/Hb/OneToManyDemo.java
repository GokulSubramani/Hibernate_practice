package Hb;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class OneToManyDemo {
public static void main(String[] args) {
	

	Subject s1=new Subject();
	s1.setSub_id("sub-1");
	s1.setSub_name("Java");
	s1.setCategory("Backend");
	
	Subject s2=new Subject();
	s2.setSub_id("sub-2");
	s2.setSub_name("AWS");
	s2.setCategory("Cloud");
	
	List<Subject> lst=new ArrayList<Subject>();
	lst.add(s1);
	lst.add(s2);
	
	Teacher te=new Teacher();
	te.setTeacher_id("Teacher-1");
	te.setTeacher_name("abcd");
	te.setSub(lst);
	
	Configuration con=new Configuration();
	con.configure("Hb/sample.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction t=ses.beginTransaction();
	ses.persist(te);
	
	t.commit();
	ses.close();
	sf.close();
	
	System.out.print("Success...");
}
}