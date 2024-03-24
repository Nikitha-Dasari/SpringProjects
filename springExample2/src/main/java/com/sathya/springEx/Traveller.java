package com.sathya.springEx;

public class Traveller implements Vehicle{
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	private String email;
	private long mobile;
	Vehicle vehicle;
	
	
	public void startJourney() {
		System.out.println("Hey "+name+" started your journey");
		System.out.println("Check your details "+mobile+" "+email);
		vehicle.move();

		
}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}