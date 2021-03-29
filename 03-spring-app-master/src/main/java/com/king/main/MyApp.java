package com.king.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.king.beans.Person;

public class MyApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
		System.out.println(person.getAddress().getCity());
	}
}
