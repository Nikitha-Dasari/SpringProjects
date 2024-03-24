package com.sathya.springEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
       
       Person person1=context.getBean("person1",Person.class);
       person1.personInfo();
       
       Person person2=context.getBean("p",Person.class);
       person2.personInfo();
    }
}
