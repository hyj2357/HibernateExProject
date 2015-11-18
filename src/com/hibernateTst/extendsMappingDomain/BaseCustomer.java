package com.hibernateTst.extendsMappingDomain;

import java.util.Set;

public class BaseCustomer {   
	private String name;
	private int id;
	private Set<Message> receive_message,publish_message;
	
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
	public Set<Message> getReceive_message() {
		return receive_message;
	}
	public void setReceive_message(Set<Message> receive_message) {
		this.receive_message = receive_message;
	}
	public Set<Message> getPublish_message() {
		return publish_message;
	}
	public void setPublish_message(Set<Message> publish_message) {
		this.publish_message = publish_message;
	}
	 
}
