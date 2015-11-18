package com.hibernateTest.relationmappingdomain;

import java.util.HashSet;
import java.util.Set;

public class Admin {
    private String admin_name;
    private int admin_id;
    private Set<Customer> customer_set = new HashSet<Customer>();
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public Set<Customer> getCustomer_set() {
		return customer_set;
	}
	public void setCustomer_set(Set<Customer> customer_set) {
		this.customer_set = customer_set;
	}
   
}
