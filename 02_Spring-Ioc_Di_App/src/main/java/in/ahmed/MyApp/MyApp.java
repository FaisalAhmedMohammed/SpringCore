package in.ahmed.MyApp;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.UserService;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBean.xml");

		UserService bean = ctxt.getBean(UserService.class);

		bean.saveuser("ashok", "ashokit@1234", 12343456l);
	}

}
