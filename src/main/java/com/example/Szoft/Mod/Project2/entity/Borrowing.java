package com.example.Szoft.Mod.Project2.entity;

import com.example.Szoft.Mod.Project2.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;

@Entity
@Table(name = "kolcsonzes")
public class Borrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BORROWING_ID")
    @JsonView(Views.Base.class)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    @JsonView(Views.FromMovie.class)
    private Person fk_person;

    public Borrowing(int id, Person fk_person){
        this.id = id;
        this.fk_person = fk_person;
    }

    public Borrowing(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getFk_person() {
        return fk_person;
    }

    public void setFk_person(Person fk_person) {
        this.fk_person = fk_person;
    }
}
