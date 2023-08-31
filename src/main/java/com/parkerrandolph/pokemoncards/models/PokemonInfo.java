package com.parkerrandolph.pokemoncards.models;

public class PokemonInfo {

    private String name;

    private long id;
    private long weight;
    private long height;
    private long base_experience;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getHeight() {
        return height;
    }

    public long getWeight() {
        return weight;
    }

    public long getBase_experience() {
        return base_experience;
    }


}
