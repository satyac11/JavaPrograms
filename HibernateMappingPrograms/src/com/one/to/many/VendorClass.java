/**
 * 
 */
package com.one.to.many;

import java.util.List;

/**
 * @author satya
 *
 */
public class VendorClass {
	private int vendorId;
	private String vendorName;
	//private Set<CustomerClass> customers;
	
	private List<CustomerClass> customers;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public List<CustomerClass> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerClass> customers) {
		this.customers = customers;
	}

	/*public Set getCustomers() {
		return customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}*/

}
