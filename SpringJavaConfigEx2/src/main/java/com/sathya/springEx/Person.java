package com.sathya.springEx;

public class Person {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String email;
	
	public void personInfo()
	{
		System.out.println("Hey "+name+" welcome");
		System.out.println("Check your mail "+email);
	}
	
}
