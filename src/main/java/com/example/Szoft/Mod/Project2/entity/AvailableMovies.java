package com.example.Szoft.Mod.Project2.entity;

import javax.persistence.*;

@Entity
@Table(name = "elerheto_filmek")
public class AvailableMovies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AVA_MOVIES_ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "RATING")
    private String rating;

    @Column(name = "YEAR")
    private String year;

    public AvailableMovies() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
