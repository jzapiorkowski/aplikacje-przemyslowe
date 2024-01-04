package com.przemyslowe.lab4.zad3.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.przemyslowe.lab4.zad3.domain.Person;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<Person>();
    private Long nextUserId = 100L;


    public Person addPerson(Person person) {
        person.setId(nextUserId);
        this.nextUserId++;

        this.persons.add(person);

        System.out.println("PersonService.addPerson() - " + this.persons.size());
        System.out.println(this.getPersons());
        return person;
    }

    public Person getPerson(Long targetId) {
        for (Person person : this.persons) {
            if (person.getId().equals(targetId)) {
                return person;
            }
        }

        return null;
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void updatePerson(Long id, Person updatedPerson) {
        for (Person person : this.persons) {
            if (person.getId().equals(id)) {
                person.setFirstName(updatedPerson.getFirstName());
                person.setLastName(updatedPerson.getLastName());
                person.setEmail(updatedPerson.getEmail());
                person.setCompanyName(updatedPerson.getCompanyName());

                return;
            }
        }
    }

    public void deletePerson(Long id) {
        persons.removeIf(person -> person.getId().equals(id));
    }
}
