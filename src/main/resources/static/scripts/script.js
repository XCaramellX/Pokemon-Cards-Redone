
function getSpecificPokemon(){
    const name = document.getElementById("pokemonName").value;
    fetch(`/pokemon?name=${name}`)
        .then(response => {
            if(!response.ok){
                throw new Error('Error');
            }

         return response.json();
         })
        .then(pokemon => {
            document.getElementById("imageID").src =
            `https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${pokemon.id}.png`;
            document.getElementById("pokemonCardName").innerText = pokemon.name;
            document.getElementById("pokemonCardHeight").innerText = "Height: " + pokemon.height;
            document.getElementById("pokemonCardWeight").innerText = "Weight: " + pokemon.weight;
            document.getElementById("pokemonCardBaseExperience").innerText = "Base Experience: " +
            pokemon.base_experience;
        })
        .catch(error => {
         console.log(error);
        });

}

document.getElementById("getCard").addEventListener("click", getSpecificPokemon);