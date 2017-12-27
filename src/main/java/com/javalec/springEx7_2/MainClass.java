package com.javalec.springEx7_2;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.springEx7_2.Student;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX7_2.xml");
		
		ctx.refresh();
		
		Student student = ctx.getBean("student", Student.class);	// 사용
		System.out.println("이름 : " + student.getName());
		System.out.println("나이 : " + student.getAge());
		
		ctx.close();
	}
}
