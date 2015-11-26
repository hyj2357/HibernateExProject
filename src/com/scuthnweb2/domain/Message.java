package com.scuthnweb2.domain;

public class Message {
	
     private Integer id;
     private String title,content;
     private Integer read;
     
     private Account sender_account,receiver_account;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getRead() {
		return read;
	}

	public void setRead(Integer read) {
		this.read = read;
	}

	public Account getSender_account() {
		return sender_account;
	}

	public void setSender_account(Account sender_account) {
		this.sender_account = sender_account;
	}

	public Account getReceiver_account() {
		return receiver_account;
	}

	public void setReceiver_account(Account receiver_account) {
		this.receiver_account = receiver_account;
	}
}
