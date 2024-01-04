package com.przemyslowe.lab4.zad3;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.przemyslowe.lab4.zad3.domain.Person;


@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Zad3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Zad3Application.class, args);

		Map<String,Person> beans = context.getBeansOfType(Person.class);


		for (Map.Entry<String, Person> entry : beans.entrySet()) {
            String beanName = entry.getKey();
            Person myBean = entry.getValue();
            
			System.out.println("Bean name: " + beanName);
			System.out.println("Bean: " + myBean);
        }

	}

}
