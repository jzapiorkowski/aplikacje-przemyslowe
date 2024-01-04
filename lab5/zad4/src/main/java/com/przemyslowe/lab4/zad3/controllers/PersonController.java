package com.przemyslowe.lab4.zad3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.przemyslowe.lab4.zad3.domain.Person;
import com.przemyslowe.lab4.zad3.services.PersonService;


@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping()
    public List<Person> getPersons() {
        return this.personService.getPersons();
    }

    @PostMapping
    public Person addPerson(@RequestBody() Person person) {
        return this.personService.addPerson(person);
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable Long id) {
        return this.personService.getPerson(id);
    }

    @PutMapping("/{id}")
    public void updatePerson(@PathVariable Long id, @RequestBody Person person) {
        this.personService.updatePerson(id, person);
    }
    
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        this.personService.deletePerson(id);
    }
}
