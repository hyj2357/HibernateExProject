package com.hibernateTest.relationmappingdomain;

public class Customer {
   private String customer_name;
   private int customer_id;
   private Address customer_address;
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public Address getCustomer_address() {
	return customer_address;
}
public void setCustomer_address(Address customer_address) {
	this.customer_address = customer_address;
}
  public String toString(){
	  return this.customer_id+":"+this.customer_name+" addr:"+this.customer_address;
  }
}
