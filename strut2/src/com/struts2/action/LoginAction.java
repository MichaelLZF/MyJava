package com.struts2.action;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.model.User;

public class LoginAction extends ActionSupport{

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public String execute() throws Exception{
		return SUCCESS;
	}
}
