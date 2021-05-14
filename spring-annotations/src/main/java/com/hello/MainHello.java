package com.hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
 
@Configuration
@ComponentScan
public class MainHello {
 
  @Bean
  GreetingService mockGreetingService() {
    return new GreetingService() {
      public String greet() {
        return "Good Day!";
      }
    };
  }
 
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
        MainHello.class);
    GreetingBot greeter = context.getBean(GreetingBot.class);
    greeter.print();
  }
}




