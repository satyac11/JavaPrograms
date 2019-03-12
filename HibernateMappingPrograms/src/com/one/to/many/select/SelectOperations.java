package com.one.to.many.select;

import java.util.List;

import org.hibernate.Session;

import com.one.to.many.CustomerClass;
import com.one.to.many.VendorClass;
import com.util.classes.SessionUtil;

public class SelectOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = SessionUtil.createSession();
		VendorClass vendor=(VendorClass)session.get(VendorClass.class, 2);
		
		if(vendor!=null) {
			List<CustomerClass> customers = vendor.getCustomers();
			System.out.println("Vendor Name is: "+vendor.getVendorName());
			
			for(CustomerClass customer: customers) {
				System.out.println("Customer Name Is: "+customer.getCustomerName()+" Address: "+customer.getCustomerAddress());
			}
		}
		
		CustomerClass customer2= vendor.getCustomers().get(1);
		System.out.println("2nd record of Customer Name Is: "+customer2.getCustomerName()+" Address: "+customer2.getCustomerAddress());
		session.close();

	}

}
