package com.mariworld.spring;

import com.mariworld.spring.service.UserDaoJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan
public class TobySpringStudyApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext ac = SpringApplication.run(TobySpringStudyApplication.class, args);
		System.out.println(ac);
		System.out.println(ac.getBeanFactory());
	}

}
