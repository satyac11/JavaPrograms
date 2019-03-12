package com.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.firstprogram.SessionUtil;

public class NonSelectQueryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		
		//Update Query
		//String update ="update StudentClass t set t.name='satya' where t.age=25";
		//String update ="update StudentClass t set t.name='murali' where t.age=:age";
		String update ="update StudentClass t set t.name='satya' where t.age=?";
		Query query = session.createQuery(update);
		//query.setParameter("age", 25);
		query.setParameter(0, 25);
		Transaction tx = session.beginTransaction();
		int n = query.executeUpdate();		
		System.out.println("Total: "+n+" records updated.");
		tx.commit();
		session.close();
		

	}

}
