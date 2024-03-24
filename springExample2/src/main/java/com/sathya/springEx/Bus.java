package com.sathya.springEx;

public class Bus implements Vehicle{

	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	private String busType;
	private int maxSpeed;
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("You have selected Car Vehicle");
		System.out.println("Max Speed "+maxSpeed);
		System.out.println("Bus Type "+busType);
		
	}
	

}
