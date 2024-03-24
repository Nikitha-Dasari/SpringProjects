package com.sathya.springEx.springJavaConfigEx3;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {

	@Override
	public void message() {
		System.out.println("You will get email updates.Check mail");		
	}

}
