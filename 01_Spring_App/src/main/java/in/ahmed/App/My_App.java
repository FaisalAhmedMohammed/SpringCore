package in.ahmed.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.Beans.Desiel_Engine;

public class My_App {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		Desiel_Engine de = ctxt.getBean(Desiel_Engine.class);
		de.start();
	}

}
