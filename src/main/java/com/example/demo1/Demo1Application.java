package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Demo1Application {

	public static void main(String[] args) {
		/*
		All the three kind of ways are correct to define path of file or just the file or using Tostring.
		 */
		//ApplicationContext context = new FileSystemXmlApplicationContext(Paths.get("src/main/resources/beans.xml").toString());
		//ApplicationContext context = new ClassPathXmlApplicationContext(Paths.get("beans.xml").toString());
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");// bean is present here in context thats how bean is called
		Car car = context.getBean("car",Car.class);// bean calling class Car
		System.out.println(car.getEngine().getEngineType());
		System.out.println(context.getBean(Student.class));
		((ConfigurableApplicationContext) context).registerShutdownHook();// used to shut down

	}

}
