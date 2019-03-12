package com.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.firstprogram.SessionUtil;
import com.firstprogram.StudentClass;

public class SelectQueryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		//Full Object Load
		/*Query query = session.createQuery("from StudentClass t");		
		List<StudentClass> students = query.list();
		for(StudentClass student:students) {
			System.out.printf("student name:%s age:%s\n",student.getName(),student.getAge());
		}*/
		
		//Partial Object		
		/*String hql = "select t.name,t.age from StudentClass t";
		Query query = session.createQuery(hql);		
		List students = query.list();
		Iterator iterator = students.iterator();
		
		
		while(iterator.hasNext()) {
			Object[] rows =(Object[])iterator.next();
			System.out.println("name: "+rows[0]+" age: "+rows[1]);
			
		}*/	
		
		//Single property of an object
		String hql ="select t.name from StudentClass t";
		Query query = session.createQuery(hql);
		List list = query.list();
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next().toString();
			System.out.println("Name: "+name);
		}
		
	}

}
