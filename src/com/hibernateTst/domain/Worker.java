package com.hibernateTst.domain;

import java.util.HashMap;
import java.util.Map;

public class Worker {
	private int id;
	private String name;
    private Map<Integer,String> infoMap = new HashMap<Integer,String>();
	
    public Worker(){ }
	
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
	public Map<Integer, String> getInfoMap() {
		return infoMap;
	}
	public void setInfoMap(Map<Integer, String> infoMap) {
		this.infoMap = infoMap;
	}
    public String toString(){
    	return id+":"+this.name+this.infoMap.toString();
    }
}
