package in.ahmed.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.ATM;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBeans.xml");
		ATM bean = ctxt.getBean(ATM.class);
		bean.withdraw();
	}

}
