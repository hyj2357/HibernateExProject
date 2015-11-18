package com.hibernateTest.sqlQuery;

public class Admin {
    private String name;
    private int id;
    private String admin_password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String password) {
		this.admin_password = password;
	}
    public void info(){
    	System.out.println(this.id+":"+this.name+" p:"+this.admin_password);
    }
}
