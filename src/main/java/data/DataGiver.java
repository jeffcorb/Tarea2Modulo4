package data;

import model.Pokemon;
import org.testng.annotations.DataProvider;

import java.util.Map;

public class DataGiver {
    private final static Map<Integer, Pokemon> pokemonMap = MapParser.getPokemonMap();
    public final static String DP_NOMBRES = "Data Provider Nombres";
    public final static String DP_POKEMONS = "Data Provider POKEMONS";


    public static Pokemon getByID(int id) {
        return pokemonMap.get(id);
    }

    @DataProvider(name = DP_POKEMONS)
    public Object[][] pokemonDataProvider() {
        final var pokemonLista = ExcelReader.getPokemon();
        final var object = new Object[pokemonLista.size()][];

        for (var i = 0; i < pokemonLista.size(); i++) {
            final var currentElement = pokemonLista.get(i);
            object[i] = new Object[]{
                    currentElement
            };
        }
        return object;
    }
}

