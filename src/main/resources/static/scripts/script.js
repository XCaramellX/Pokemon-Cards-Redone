
function getSpecificPokemon(){

try{
    const name = document.getElementById("pokemonName").value;
    fetch(`/pokemon?name=${name}`)
        .then(response => response.json())
        .then(pokemon => {
            document.getElementById("pokemonCardName").innerText = pokemon.name;
            document.getElementById("pokemonCardHeight").innerText = "Height: " + pokemon.height;
            document.getElementById("pokemonCardWeight").innerText = "Weight: " + pokemon.weight;
            document.getElementById("pokemonCardBaseExperience").innerText = "Base Experience: " +
            pokemon.base_experience;
        });
        }catch(HttpClientErrorException e){
            System.out.println("Client Error 404, Not Found");
            e.printStackTrace();
        }
}

document.getElementById("getCard").addEventListener("click", getSpecificPokemon);