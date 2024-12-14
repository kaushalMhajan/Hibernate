package it.edu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import it.edu.Course;

public class Task_1 {

	public static void main(String[] args) {
			
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session sessionObj = factory.openSession();
		
		Course c1 = new Course("102","CDAC",390,12000);
		
		Transaction tx = sessionObj.beginTransaction();
		sessionObj.persist(c1);
		tx.commit();
		
		sessionObj.close();
		factory.close();

	}

}
