package com.example.Szoft.Mod.Project2.entity;

import javax.persistence.*;

@Entity
@Table(name = "kategoria")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CATEGORY_ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    public Category() {

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
}
