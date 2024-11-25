package in.ahmed.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("SpringBeans.xml");
	}
	

}
