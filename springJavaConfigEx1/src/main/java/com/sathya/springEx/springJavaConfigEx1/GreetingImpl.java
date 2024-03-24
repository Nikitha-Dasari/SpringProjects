package com.sathya.springEx.springJavaConfigEx1;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
	}

	public GreetingImpl() {
		System.out.println("Object created");
		// TODO Auto-generated constructor stub
	}
	

}
