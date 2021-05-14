package com.questionanswer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
ApplicationContext context= new ClassPathXmlApplicationContext("Frame.xml");
		
		Question obj=(Question) context.getBean("q");
		obj.displayInfo();


	}

}
