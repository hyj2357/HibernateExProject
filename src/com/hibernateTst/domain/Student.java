package com.hibernateTst.domain;

public class Student {
	
    private int    id;
	private String name;
    private String[] schools;
    
    public Student(){ }

	public int getId() {
		return id;
	}

	public void setId(int student_id) {
		this.id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String student_name) {
		this.name = student_name;
	}

	public String[] getSchools() {
		return schools;
	}

	public void setSchools(String[] schools) {
		this.schools = schools;
	};
    
    
    
}
