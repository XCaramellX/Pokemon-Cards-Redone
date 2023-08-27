package com.parkerrandolph.pokemoncards.controller;

import com.parkerrandolph.pokemoncards.models.PokemonInfo;
import com.parkerrandolph.pokemoncards.service.PokemonApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private PokemonApi pokemonApi;

    @GetMapping("/")
    public String homePage(@RequestParam String name, Model model){
        PokemonInfo pokemonInfo;
        return "index";
    }
}
