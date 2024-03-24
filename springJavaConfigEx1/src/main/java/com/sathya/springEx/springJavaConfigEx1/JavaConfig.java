package com.sathya.springEx.springJavaConfigEx1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public GreetingImpl greet()
	{
		GreetingImpl greetingImpl=new GreetingImpl();
		return greetingImpl;
	}
	

}
