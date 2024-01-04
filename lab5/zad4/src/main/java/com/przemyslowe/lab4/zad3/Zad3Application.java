package com.przemyslowe.lab4.zad3;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.przemyslowe.lab4.zad3.domain.Person;
import com.przemyslowe.lab4.zad3.services.PersonService;


@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Zad3Application {

	private static PersonService personService;

	public Zad3Application() {
		personService = new PersonService();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Zad3Application.class, args);

		Map<String,Person> beans = context.getBeansOfType(Person.class);


		for (Map.Entry<String, Person> entry : beans.entrySet()) {
            Person person = entry.getValue();
            
			personService.addPerson(person);
        }

	}

}
