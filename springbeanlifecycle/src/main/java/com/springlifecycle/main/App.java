package com.springlifecycle.main;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlifecycle.service.CustomerService;

public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"context.xml"});
    
    	CustomerService cust = (CustomerService)context.getBean("CustomerService");
    	
    	System.out.println(cust);
    	
    	context.close();
    }
}

