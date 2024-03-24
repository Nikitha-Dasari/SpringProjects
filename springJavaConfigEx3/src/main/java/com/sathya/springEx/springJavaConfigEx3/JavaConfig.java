package com.sathya.springEx.springJavaConfigEx3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sathya.springEx.springJavaConfigEx3")
public class JavaConfig {
	/*@Bean
	public EmailService emailService()
	{
		EmailService emailService=new EmailService();
		return emailService;
	}
	@Bean
	public JavaCourseService javaCourseService()
	{
		JavaCourseService javaCourseService=new JavaCourseService();
		return javaCourseService;
	}
	@Bean
	public StudentService studentService()
	{
		StudentService studentService=new StudentService(emailService(), javaCourseService());
		//studentService.setEmailService(emailService());
		//studentService.setJavaCourseService(javaCourseService());
		return studentService;
	}*/

}
