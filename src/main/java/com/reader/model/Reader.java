package com.reader.model;

public class Reader {
	
	public Integer id;
	public String name;
	public String emailId;
	public String phone;
	public String password;
	public String type;
	
	public Reader(Integer id, String name, String emailId, String phone, String password, String type) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.type = type;
	}
	
	public Reader() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}