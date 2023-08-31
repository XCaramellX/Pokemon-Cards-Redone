package com.parkerrandolph.pokemoncards.controller;

import com.parkerrandolph.pokemoncards.models.PokemonInfo;
import com.parkerrandolph.pokemoncards.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.HttpClientErrorException;

@Controller
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/pokemon")
    public @ResponseBody PokemonInfo pokemon(@RequestParam String name){
        try {

            return pokemonService.getPokemon(name);
        }catch(HttpClientErrorException e){
            System.out.println("Client Error 404, Not Found");
            e.printStackTrace();
        }
        return null;
    }
}
