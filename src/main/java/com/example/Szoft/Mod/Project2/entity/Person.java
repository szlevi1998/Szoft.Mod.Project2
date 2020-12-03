package com.example.Szoft.Mod.Project2.entity;

import com.example.Szoft.Mod.Project2.views.Views;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "szemely")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID")
    @JsonView(Views.Base.class)
    private int id;

    @Column(name = "PHONE_NUMBER")
    @JsonView(Views.Base.class)
    private String phoneNumber;

    @Column(name = "PERSON_NAME")
    @JsonView(Views.Base.class)
    private String name;

    @Column(name = "CITY")
    @JsonView(Views.Base.class)
    private String city;

    @Column(name = "TAX_NUMBER")
    @JsonView(Views.Base.class)
    private String tax_number;

    @Column(name = "GENDER")
    @JsonView(Views.Base.class)
    private String gender;

    @Column(name = "DATE_OF_BIRTH")
    @JsonView(Views.Base.class)
    private String date_of_birth;

    @OneToMany(mappedBy = "fk_person", cascade = CascadeType.ALL)
    @JsonView(Views.FromPerson.class)
    private List<Borrowing> borrowings;

    public Person(int id) {
        this.id = id;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTax_number() {
        return tax_number;
    }

    public void setTax_number(String tax_number) {
        this.tax_number = tax_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }

    public void setBorrowings(List<Borrowing> borrowings) {
        this.borrowings = borrowings;
    }
}
