package com.example.createRest.Entity;

import org.springframework.data.annotation.Id;

public class User {
	@Id
	private int UserId;
	private String name;
	private String address;
	
	public User(int userId, String name, String address) {
		super();
		UserId = userId;
		this.name = name;
		this.address = address;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
