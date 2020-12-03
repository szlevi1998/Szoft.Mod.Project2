package com.example.Szoft.Mod.Project2.controller;

import com.example.Szoft.Mod.Project2.dto.PersonList;
import com.example.Szoft.Mod.Project2.entity.Person;
import com.example.Szoft.Mod.Project2.service.PersonService;
import com.example.Szoft.Mod.Project2.views.Views;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @JsonView(Views.FromPerson.class)
    @RequestMapping(method = RequestMethod.GET)
    public PersonList getAllPerson() {
        return personService.getAllPerson();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Person> getPersonById(@PathVariable("id") int id){
        return personService.getPersonById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deletePersonById(@PathVariable("id") int id) {
        return personService.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePerson(@RequestBody Person person) {
        personService.updatePerson(person);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPerson(@RequestBody Person person){
        personService.insertPerson(person);
    }
}
