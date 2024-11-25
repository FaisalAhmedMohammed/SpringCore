package in.ahmed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.Car;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Car bean = ctxt.getBean(Car.class);
		bean.drive();
		
		
	}

}
