const pokemons = [
  {
    name: 'Pikachu',
    type: 'eletric'
  },
  {
    name: 'Squirtle',
    type: 'water'
  },
  {
    name: 'Magikarp',
    type: 'water'
  },
];

const pokemosByType = pokemons.reduce((pokemosByType, currentPokemon) => {
  console.log(pokemosByType)
  pokemosByType[currentPokemon.type] = pokemosByType[currentPokemon.type] || [];
  pokemosByType[currentPokemon.type].push(currentPokemon);
  return pokemosByType;
}, {});

console.log(pokemosByType);



const finalObject = {
  eletric: [],
  water: []
}