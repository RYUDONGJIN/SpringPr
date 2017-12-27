package com.javalec.springEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc); 
		MyCalculator myCal = ctx.getBean("myCalculator", MyCalculator.class);
		
		myCal.add();
		myCal.sub();
		myCal.multi();
		myCal.div();
		
		ctx.close();
	}
}
