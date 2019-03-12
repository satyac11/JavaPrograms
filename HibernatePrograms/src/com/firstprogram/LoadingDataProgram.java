package com.firstprogram;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadingDataProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		StudentClass student = (StudentClass) session.get(StudentClass.class, 1);//Early Loading
		if (student != null)
			System.out.println("Name: " + student.getName() + " age: " + student.getAge() + " roleNumber: "
					+ student.getRoleNumber());
		else
			System.out.println("No record exist......");
		
		//session.clear();
		//session.evict(student);
		
		StudentClass student1 = (StudentClass) session.get(StudentClass.class, 1);//get the record from cache
		if (student != null)
			System.out.println("Name: " + student1.getName() + " age: " + student1.getAge() + " roleNumber: "
					+ student1.getRoleNumber());
		else
			System.out.println("No record exist......");
		session.close();
		sf.close();
	}

}
