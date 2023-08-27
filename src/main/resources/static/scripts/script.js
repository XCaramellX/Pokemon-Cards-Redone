
function getSpecificPokemon(){
    const name = document.getElementById("pokemonName").value;
    fetch(`/pokemon?name=${name}`)
        .then(response => response.json())
        .then(data => {
            document.getElementById("pokemonInfo").innerText = JSON.stringify(data);
        });
}

document.getElementById("getCard").addEventListener("click", getSpecificPokemon);