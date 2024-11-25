package in.ashokit.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.CngEngine;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		CngEngine ce = ctxt.getBean(CngEngine.class);
		ce.start();
	}

}
