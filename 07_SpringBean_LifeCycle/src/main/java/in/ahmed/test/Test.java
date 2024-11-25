package in.ahmed.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.Motor;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctxt=
				new ClassPathXmlApplicationContext("SpringBeans.xml");
		Motor bean = ctxt.getBean(Motor.class);
		bean.work();
		ConfigurableApplicationContext cttxt= (ConfigurableApplicationContext)ctxt;
		cttxt.close();
				
	
	}

}
