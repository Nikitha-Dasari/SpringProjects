package com.sathya.springEx.springJavaConfigEx1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
        GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
        greetingImpl.greet();
    }
}
