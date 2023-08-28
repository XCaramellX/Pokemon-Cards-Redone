package com.parkerrandolph.pokemoncards.models;

import jakarta.persistence.*;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, nullable = false)
    private String name;
    @Column
    private long weight;

    @Column
    private long height;

    @Column
    private long base_experience;


    public long getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void setHeight(long height) {
        this.height = height;
    }


    public void setBase_experience(long base_experience) {
        this.base_experience = base_experience;
    }
}
