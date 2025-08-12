package com.jspider.encapsulation;

import java.io.Serializable;

public class Credentials implements Serializable {
	private String userName;
	private String pass;
	public String getUserName() {
		return "The UserName is : "+userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return "The Password is : "+pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
