package com.sathya.springEx.springJavaConfigEx3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start ioc container
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
        //get the beans
        StudentService service=context.getBean("studentService",StudentService.class);
        service.details();
        
    }
}
