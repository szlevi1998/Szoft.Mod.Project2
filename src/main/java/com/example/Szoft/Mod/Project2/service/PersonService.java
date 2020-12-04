package com.example.Szoft.Mod.Project2.service;

import com.example.Szoft.Mod.Project2.dto.PersonList;
import com.example.Szoft.Mod.Project2.entity.Person;
import com.example.Szoft.Mod.Project2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public PersonList getAllPerson() {
        PersonList personList = new PersonList();
        personList.setData(personRepository.findAll());
        return personList;
    }

    public Optional<Person> getPersonById(Integer id){
        return this.personRepository.findById(id);
    }

    public String removeStudentById(Integer id) {
        try {
            this.personRepository.deleteById(id);
            return "Sikeres törlés!";
        }
        catch(Exception e) {
            return "Nem létezik ilyen id!";
        }
    }

    public void updatePerson(Person person) {
        this.personRepository.save(person);
    }

    public String insertPerson(Person person) {
        try {
            this.personRepository.save(person);
            return "Sikerült a hozzáadás!";
        }
        catch(HttpMessageNotReadableException e) {
            return "Nem sikerült a hozzáadás..hibás formátum.";
        }

    }
}
