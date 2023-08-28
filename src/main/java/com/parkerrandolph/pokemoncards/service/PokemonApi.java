package com.parkerrandolph.pokemoncards.service;

import com.parkerrandolph.pokemoncards.models.Pokemon;
import com.parkerrandolph.pokemoncards.models.PokemonInfo;
import com.parkerrandolph.pokemoncards.repo.PokemonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonApi {

    @Autowired
    private PokemonRepo pokemonRepo;

    public PokemonInfo getPokemon(String name){

            String url = "https://pokeapi.co/api/v2/pokemon/" + name;
            RestTemplate restTemplate = new RestTemplate();

            PokemonInfo pokemonInfo = restTemplate.getForObject(url, PokemonInfo.class);

            Pokemon pokemon = new Pokemon();

            pokemon.setName(pokemonInfo.getName());
            pokemon.setWeight(pokemonInfo.getWeight());
            pokemon.setHeight(pokemonInfo.getHeight());
            pokemon.setBase_experience(pokemonInfo.getBase_experience());

            pokemonRepo.save(pokemon);

            return pokemonInfo;
    }
}
