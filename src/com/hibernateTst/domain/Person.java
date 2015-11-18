package com.hibernateTst.domain;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id,age;
    private String name;
    private List<String> schools=new ArrayList<String>();
	
    public Person(){ }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSchools() {
		return schools;
	}
	public void setSchools(List<String> schools) {
		this.schools = schools;
	};
      
}
