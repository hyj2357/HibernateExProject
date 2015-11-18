package com.hibernateTest.relationmappingdomain;

import java.util.Set;

public class Address {
	 private int address_id;
     private String city; 
     private String part;
     private Set<Customer> customer_set;
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String toString(){
		return this.city+"_"+this.part;
	}
	public Set<Customer> getCustomer_set() {
		return customer_set;
	}
	public void setCustomer_set(Set<Customer> customer_set) {
		this.customer_set = customer_set;
	}
}
