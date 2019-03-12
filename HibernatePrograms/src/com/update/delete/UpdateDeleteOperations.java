package com.update.delete;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.firstprogram.SessionUtil;
import com.firstprogram.StudentClass;

public class UpdateDeleteOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		//Update Approach 1
		/*StudentClass student = new StudentClass();
		student.setRoleNumber(1);
		student.setName("Satya");
		student.setAge(26);
		
		Transaction tx = session.beginTransaction();
		session.update(student);
		tx.commit();*/
		
		
		//Update Approach 2
		/*StudentClass stu = (StudentClass)session.get(StudentClass.class, 1);
		stu.setAge(25);
		
		Transaction tx = session.beginTransaction();
		session.update(stu);
		tx.commit();*/
		
		//Delete Approach 1
		/*StudentClass student = new StudentClass();
		student.setRoleNumber(2);
		Transaction tx = session.beginTransaction();
		session.delete(student);
		tx.commit();*/
		
		
		//Delete Approach 2
		StudentClass student = (StudentClass)session.get(StudentClass.class, 2);
		Transaction tx = session.beginTransaction();
		session.delete(student);
		tx.commit();
		session.close();
		
		//StudentClass st = (StudentClass) session.get(StudentClass.class, 1);
		
	}

}
