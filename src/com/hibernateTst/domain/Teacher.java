package com.hibernateTst.domain;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
    private  int id;
    private  String name;
    private  Set<String>schools=new HashSet<String>();
    
    public Teacher(){ }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String>getSchools() {
		return schools;
	}
	public void setSchools(Set<String>schools) {
		this.schools = schools;
	};
    
   
}
