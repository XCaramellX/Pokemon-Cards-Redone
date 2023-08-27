package com.parkerrandolph.pokemoncards.models;

import jakarta.persistence.*;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private long weight;

    @Column
    private long height;

    @Column
    private long base_experience;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(long base_experience) {
        this.base_experience = base_experience;
    }
}
