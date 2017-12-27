package com.javalec.springEx7_3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX7_3.xml");
		
		Student student1 = ctx.getBean("student", Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("도찌");
		student2.setAge(28);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		} else {
			System.out.println("다르다");
		}
		
		ctx.close();
	}
}
