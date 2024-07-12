package Hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateXMLDemo {

    public static void main(String[] args) {
        student st = new student();
        st.setRollno("st-3");
        st.setStname("ghi");
        st.setRank(4);
        st.setMark(94.01);

        Configuration config = new Configuration();
        config.configure("Hb/sample.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(st);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Success...");
    }
}
