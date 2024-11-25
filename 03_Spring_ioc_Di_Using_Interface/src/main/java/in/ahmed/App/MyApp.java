package in.ahmed.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.Car;
import in.ahmed.beans.DesielEngine;
import in.ahmed.beans.PetrolEngine;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBeans.xml");
		PetrolEngine bean = ctxt.getBean(PetrolEngine.class);
		System.out.println(bean.hashCode());

		
		PetrolEngine bean2 = ctxt.getBean(PetrolEngine.class);
		System.out.println(bean2.hashCode());

	}

}
