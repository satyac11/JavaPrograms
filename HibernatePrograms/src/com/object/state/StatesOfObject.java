package com.object.state;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.firstprogram.SessionUtil;
import com.firstprogram.StudentClass;

public class StatesOfObject {

	public static void main(String[] args) {
		Session session = SessionUtil.createSession();
		StudentClass student = null;//Transient object
		student=(StudentClass)session.get(StudentClass.class, 1);//PersistentObject
		session.evict(student);//Detached object
		student.setName("Satya");
		
		Session session2 = SessionUtil.createSession();
		StudentClass student2 = (StudentClass)session.get(StudentClass.class, 1);
		
		Transaction tx = session.beginTransaction();
		session2.update(student);//Persistent object
		tx.commit();
		session.close();
	}

}
