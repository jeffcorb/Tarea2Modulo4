package data;

import model.Pokemon;

import java.util.Map;

public class DataGiver {
    private final static Map<Integer, Pokemon> pokemonMap = MapParser.getPokemonMap();

    public static Pokemon getByID(int id) {
        return pokemonMap.get(id);
    }
}
