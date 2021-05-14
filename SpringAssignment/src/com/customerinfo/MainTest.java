package com.customerinfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Frame.xml");
		 Customer obj=(Customer) context.getBean("customer");
		 obj.displayInfo();
		}}
