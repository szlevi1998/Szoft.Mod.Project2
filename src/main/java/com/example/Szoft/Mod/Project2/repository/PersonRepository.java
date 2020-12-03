package com.example.Szoft.Mod.Project2.repository;

import com.example.Szoft.Mod.Project2.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {


}