package data;

import Utilities.Logs;
import model.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class MapParser {
    public static Map<Integer, Pokemon> getPokemonMap() {
        Logs.debug("Getting Pokemons");
        final var map = new HashMap<Integer, Pokemon>();
        final var pokemonList = ExcelReader.getPokemon();

        for (var element : pokemonList) {
            map.put(element.getID(), element);
        }
        return map;
    }

}
