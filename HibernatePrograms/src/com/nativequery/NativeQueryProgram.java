package com.nativequery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.firstprogram.SessionUtil;
import com.firstprogram.StudentClass;

public class NativeQueryProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		SQLQuery squery = session.createSQLQuery("select * from student");
		/*List list = squery.list();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object[] row = (Object[])iterator.next();
			System.out.printf("roleNumber: %s name: %s  age: %s\n",row[0],row[1],row[2]);
		}*/
		squery.addEntity(StudentClass.class);//Added entity to convert object to pojo class object
		List<StudentClass> students = squery.list();
		for(StudentClass student:students) {
			System.out.printf("student name:%s age:%s\n",student.getName(),student.getAge());
		}
		
		
		
		
	}

}
