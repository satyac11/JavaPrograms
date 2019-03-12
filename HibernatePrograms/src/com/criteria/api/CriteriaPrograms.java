package com.criteria.api;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.firstprogram.SessionUtil;
import com.firstprogram.StudentClass;

public class CriteriaPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		
		Criteria cr = session.createCriteria(StudentClass.class);
		//Conditions to filter data
		/*Criterion cond1 = Restrictions.eq("name", "satya");
		Criterion cond2 = Restrictions.eq("age", 25);
		Criterion conditions = Restrictions.and(cond1,cond2);
		cr.add(conditions);
		List list = cr.list();
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			StudentClass student = (StudentClass)iterator.next();
			System.out.println("Name: "+student.getName()+" Age: "+student.getAge());
		}*/
		
		//Sorting data OrderClass
		//Order order = Order.desc("age");
		/*Order order = Order.asc("age");
		cr.addOrder(order);
		List<StudentClass> students = cr.list();
		for(StudentClass student:students) {
			System.out.printf("student name:%s age:%s\n",student.getName(),student.getAge());
		}*/
		
		//Projection to get required properties of an object
		
		Projection p1 = Projections.property("name");
		Projection p2 = Projections.property("age");
		Projection p3 = Projections.property("roleNumber");
		ProjectionList pl = Projections.projectionList();
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		cr.setProjection(pl);
		
		List list = cr.list();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object[] row = (Object[])iterator.next();
			System.out.printf("Name: %s Age: %s  roleNumber: %s\n",row[0],row[1],row[2]);
		}
	}

}
