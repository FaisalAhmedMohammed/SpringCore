package in.ahmed.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.DesielEngine;
import in.ahmed.beans.PetrolEngine;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");

	 DesielEngine bean = ctxt.getBean(DesielEngine.class);
		bean.start();
		PetrolEngine bean2 = ctxt.getBean(PetrolEngine.class);
		bean2.Start();
	}

}
