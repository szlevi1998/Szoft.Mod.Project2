package com.example.Szoft.Mod.Project2.dto;

import com.example.Szoft.Mod.Project2.entity.Person;
import com.example.Szoft.Mod.Project2.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

public class PersonList {

    @JsonView(Views.FromPerson.class)

    private Iterable<Person> data;

    public Iterable<Person> getData() {
        return data;
    }

    public void setData(Iterable<Person> data) {
        this.data = data;
    }

}
