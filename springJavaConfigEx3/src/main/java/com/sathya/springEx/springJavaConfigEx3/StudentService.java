package com.sathya.springEx.springJavaConfigEx3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	@Autowired
	private EmailService emailService;
	/*public EmailService getEmailService() {
		return emailService;
	}
	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	public JavaCourseService getJavaCourseService() {
		return javaCourseService;
	}
	@Autowired
	public void setJavaCourseService(JavaCourseService javaCourseService) {
		this.javaCourseService = javaCourseService;
	}*/
	@Autowired
	private JavaCourseService javaCourseService;
	
	/*@Autowired
	public StudentService(EmailService emailService, JavaCourseService javaCourseService) {
		super();
		this.emailService = emailService;
		this.javaCourseService = javaCourseService;
	}*/


	public void details()
	{
		emailService.message();
		javaCourseService.courseInfo();
		
	}

}
