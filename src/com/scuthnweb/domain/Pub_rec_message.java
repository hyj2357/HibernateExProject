package com.scuthnweb.domain;

public class Pub_rec_message extends com.scuthnweb.domain.BaseDomain{
	
	private int pub_rec_message_id;
	private BaseCustomer message_receiver,message_publisher;
    private Message message;
    
	public   Pub_rec_message(){};
	

	public BaseCustomer getMessage_receiver() {
		return message_receiver;
	}

	public void setMessage_receiver(BaseCustomer message_receiver) {
		this.message_receiver = message_receiver;
	}

	public BaseCustomer getMessage_publisher() {
		return message_publisher;
	}

	public void setMessage_publisher(BaseCustomer message_publisher) {
		this.message_publisher = message_publisher;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}


	public int getPub_rec_message_id() {
		return pub_rec_message_id;
	}


	public void setPub_rec_message_id(int pub_rec_message_id) {
		this.pub_rec_message_id = pub_rec_message_id;
	}
	
	
	
}
