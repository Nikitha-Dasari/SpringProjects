package com.sathya.springEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("Nikitha");
		person.setEmail("nikitha@gamil.com");
		return person;
	}
	
	@Bean(name="p")
	public Person person2()
	{
		Person person=new Person();
		person.setName("Ramya");
		person.setEmail("ramya@gamil.com");
		return person;
	}

}
