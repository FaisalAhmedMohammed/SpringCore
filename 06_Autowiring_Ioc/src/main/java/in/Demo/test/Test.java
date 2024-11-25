package in.Demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Demo.beans.UserService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBeans.xml");
		UserService bean = ctxt.getBean(UserService.class);
		bean.userRegistation();
	}

}
