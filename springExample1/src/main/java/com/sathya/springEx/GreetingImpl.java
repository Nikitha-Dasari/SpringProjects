package com.sathya.springEx;

public class GreetingImpl implements Greeting{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("This is spring first project");
		
	}

	public GreetingImpl() {
		System.out.println("Greeting constructor::object created");
	}
	

}
