package Hb;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class ManyToManyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Answer ans1=new Answer();
		ans1.setAns_id("ans-1");
		ans1.setAns("World Wide Web");
		ans1.setPosted_by("abcd");
		
		Answer ans2=new Answer();
		ans2.setAns_id("ans-1");
		ans2.setAns("World Wide Web");
		ans2.setPosted_by("abcd");
		
		Answer ans3=new Answer();
		ans3.setAns_id("ans-1");
		ans3.setAns("World Wide Web");
		ans3.setPosted_by("abcd");
		
		List<Answer> ans=new ArrayList();
		ans.add(ans1);
		ans.add(ans2);
		ans.add(ans3);
	
		Question ques=new Question();
		ques.setQues_id("ques_1");
		ques.setQues("Expand WWW");
		ques.setAnswer(ans);
		
		Configuration config = new Configuration();
        config.configure("Hb/sample.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(ques);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Success...");
		
		

	}

}
