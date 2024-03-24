package com.sathya.springEx;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App 
{
	public static void main( String[] args )
    {
    	//start the container
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
	
		System.out.println("---------------");
		//BeanFactory factory= new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
       //get the object form container call the methods
		GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
		greetingImpl.greet();
    }
}
