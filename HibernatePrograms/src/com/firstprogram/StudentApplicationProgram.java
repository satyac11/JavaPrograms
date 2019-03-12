package com.firstprogram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApplicationProgram {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sfactory = config.buildSessionFactory();
		Session session = sfactory.openSession();
		
		StudentClass student = new StudentClass();
		student.setRoleNumber(1);
		student.setAge(26);
		student.setName("satya");
		
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
		sfactory.close();
		

	}

}
