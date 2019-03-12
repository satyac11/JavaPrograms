package com.save;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.student.StudentClass;
import com.utils.SessionUtil;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		StudentClass student = new StudentClass();
		student.setRoleNumber(4);
		student.setName("Raju");
		student.setAge(26);
		
		Transaction tx = session.beginTransaction();
		//Integer id = (Integer) session.save(student);
		session.persist(student);
		tx.commit();
		//System.out.println("A record is saved and it's id is: "+id);
		session.close();
	}

}
