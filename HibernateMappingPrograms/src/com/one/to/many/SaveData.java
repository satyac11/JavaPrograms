package com.one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.util.classes.SessionUtil;

public class SaveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		
		VendorClass vendor = new VendorClass();
		vendor.setVendorName("IBM");
		vendor.setCustomers(getCustomers());
		
		Transaction tx = session.beginTransaction();
		session.save(vendor);
		tx.commit();
		session.close();
	}
	/*public static Set<CustomerClass> getCustomers() {
		Set<CustomerClass> customers = new HashSet<CustomerClass>();
		CustomerClass cs1 = new CustomerClass();
		cs1.setCustomerId(1);
		cs1.setCustomerName("kewill technologies");
		cs1.setCustomerAddress("Hyderabad");
		customers.add(cs1);
		
		CustomerClass cs2= new CustomerClass();
		cs2.setCustomerId(2);
		cs2.setCustomerName("infosys technologies");
		cs2.setCustomerAddress("Bangalore");
		customers.add(cs2);
		
		CustomerClass cs3 = new CustomerClass();
		cs3.setCustomerId(3);
		cs3.setCustomerName("satyam technologies");
		cs3.setCustomerAddress("Hyderabad");
		customers.add(cs3);
		
		return customers;
		
	}*/
	public static List<CustomerClass> getCustomers() {
		List<CustomerClass> customers = new ArrayList<CustomerClass>();
		CustomerClass cs1 = new CustomerClass();
		cs1.setCustomerId(1);
		cs1.setCustomerName("kewill technologies");
		cs1.setCustomerAddress("Hyderabad");
		customers.add(cs1);
		
		CustomerClass cs2= new CustomerClass();
		cs2.setCustomerId(2);
		cs2.setCustomerName("infosys technologies");
		cs2.setCustomerAddress("Bangalore");
		customers.add(cs2);
		
		CustomerClass cs3 = new CustomerClass();
		cs3.setCustomerId(3);
		cs3.setCustomerName("satyam technologies");
		cs3.setCustomerAddress("Hyderabad");
		customers.add(cs3);
		
		return customers;
		
	}

}
