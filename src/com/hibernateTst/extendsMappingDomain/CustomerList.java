package com.hibernateTst.extendsMappingDomain;

public class CustomerList {
	private int customerList_id;
    private BaseCustomer baseCustomer;

	public BaseCustomer getBaseCustomer() {
		return baseCustomer;
	}

	public void setBaseCustomer(BaseCustomer baseCustomer) {
		this.baseCustomer = baseCustomer;
	}

	public int getCustomerList_id() {
		return customerList_id;
	}

	public void setCustomerList_id(int customerList_id) {
		this.customerList_id = customerList_id;
	}
}
