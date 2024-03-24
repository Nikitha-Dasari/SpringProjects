package com.sathya.springEx.springJavaConfigEx3;

import org.springframework.stereotype.Component;

@Component

public class JavaCourseService implements CourseService {

	@Override
	public void courseInfo() {
		System.out.println("Java Course List");
		System.out.println("Java, Adv java, Spring");
	}

}
