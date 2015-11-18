package com.scuthnweb2.domain;

import java.util.Set;

public class Action {
	private Integer id;
	private String action_name;
	private String introduction;
	private Integer obj_status;
	
	private Account account;
	private Set<Action_pic> action_pics;
	private Set<Action_summary> action_summaries;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Set<Action_pic> getAction_pics() {
		return action_pics;
	}
	public void setAction_pics(Set<Action_pic> action_pics) {
		this.action_pics = action_pics;
	}
	public Set<Action_summary> getAction_summaries() {
		return action_summaries;
	}
	public void setAction_summarys(Set<Action_summary> action_summaries) {
		this.action_summaries = action_summaries;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAction_name() {
		return action_name;
	}
	public void setAction_name(String action_name) {
		this.action_name = action_name;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Integer getObj_status() {
		return obj_status;
	}
	public void setObj_status(Integer obj_status) {
		this.obj_status = obj_status;
	}
	
}
