package com.hibernateTst.extendsMappingDomain;

import java.util.Set;

public class Admin extends BaseCustomer{
	private int id;
	private String name,admin_password;
    public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
}
