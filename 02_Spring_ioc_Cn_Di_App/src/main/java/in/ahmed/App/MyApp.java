package in.ahmed.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.UserService;

public class MyApp {
	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBeans.xml");

		UserService userservice = ctxt.getBean(UserService.class);
		userservice.saveUser("faisal", "faisal@123", 1233456l);

	}

}
