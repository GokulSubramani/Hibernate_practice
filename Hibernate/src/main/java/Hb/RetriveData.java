package Hb;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
public class RetriveData {
	
	
	//Retrieve data from table student using HQl
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String c=sc.next();
		
		Configuration config = new Configuration();
        config.configure("Hb/sample.cfg.xml");

        SessionFactory sf = config.buildSessionFactory();
        Session ses = sf.openSession();
        Transaction t = ses.beginTransaction();

        //Query q=ses.createQuery("from student");
       // Query q=ses.createQuery("from student where rollno ='st-2'");
        Query q=ses.createQuery("from student where rollno ='"+c+"'");
        List lst=q.list();
        Iterator ite=lst.iterator();
        
        while(ite.hasNext()) {
        	student st=(student)ite.next();
        	String rno=st.getRollno();
        	String name=st.getStname();
        	int rank = st.getRank();
        	double mark= st.getMark();
        	
        	System.out.println("Student Roll No : "+rno);
        	System.out.println("Student Name: "+name);
        	System.out.println("Student Rank : "+rank);
        	System.out.println("Student Mark : "+mark);
        	System.out.println("*******************************");
        	
        }
        
	}

}
