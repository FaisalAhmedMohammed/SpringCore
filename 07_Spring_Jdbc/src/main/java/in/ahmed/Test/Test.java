package in.ahmed.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ahmed.beans.BookService;


public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBeans.xml");
		BookService bookService = ctxt.getBean(BookService.class);
		bookService.readData();
	}

}
