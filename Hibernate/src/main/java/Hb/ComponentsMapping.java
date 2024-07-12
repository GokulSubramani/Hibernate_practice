package Hb;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class ComponentsMapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Staff ID : ");
		String staff_id=sc.nextLine();
		
		System.out.println("Staff Name : ");
		String staff_name=sc.nextLine();
		
		System.out.println("Address1 : ");
		String add1=sc.nextLine();
		
		System.out.println("Address2 : ");
		String add2=sc.nextLine();
		
		System.out.println("Street : ");
		String street=sc.nextLine();
		
		System.out.println("City : ");
		String city=sc.nextLine();
		
		System.out.println("Pincode: ");
		String pincode=sc.nextLine();
		
		StaffAddress address= new StaffAddress();
		address.setAdd1(add1);
		address.setAdd2(add2);
		address.setStreet(street);
		address.setCity(city);
		address.setPincode(pincode);
		
		Staff staff=new Staff();
		staff.setStaff_id(staff_id);
		staff.setStaff_name(staff_name);
		staff.setAddress(address);
		
		Configuration con=new Configuration();
		con.configure("Hb/sample.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction t=ses.beginTransaction();
		
		ses.persist(staff);
		t.commit();
		ses.close();
		sf.close();
		
		System.out.println("Created Successfully...");
	}
	

}
