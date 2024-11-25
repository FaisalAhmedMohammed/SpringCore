package in.ahmed.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.Restuarant;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Restuarant bean = ctxt.getBean(Restuarant.class);
		bean.bill();
	}

}
