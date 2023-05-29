package testmvn.pokemon;

import base.BaseTest;
import clases.PokemonListas;
import data.DataGiver;
import org.testng.annotations.Test;

public class PokemonTests extends BaseTest {
    @Test
    public void id20Test() {
        final var id = 20;
        final var pokemon = DataGiver.getByID(id);
        softAssert.assertEquals(pokemon.getNombre(), "Raticate", "Nombre incorrecto");
        softAssert.assertEquals(pokemon.getNombreJapones(), "Ratta", "Nombre Japones incorrecto");
        softAssert.assertEquals(pokemon.getAtk(), 97, "Ataque incorrecto");
        softAssert.assertEquals(pokemon.getDef(), 9, "Defensa incorrecto");
        softAssert.assertEquals(pokemon.getSepDef(), 4, "Defensa especial incorrecto");
        softAssert.assertEquals(pokemon.getCrit(), 81, "Critico incorrecto");
        softAssert.assertEquals(pokemon.getPeso(), 7.28, "Peso incorrecto");
        softAssert.assertTrue(pokemon.isAtrapado());
        softAssert.assertAll();
    }

    @Test
    public void ordenarAtaqueTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var listaOrdenada = PokemonListas.bubbleSortAtaque(listaPokemon);
        softAssert.assertEquals(listaOrdenada[0].getNombre(), "Clefairy", "Pokemon incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void ordenarNombresTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var listaOrdenada = PokemonListas.bubbleSortPokemon(listaPokemon);
        softAssert.assertEquals(listaOrdenada[0].getNombre(), "Zubat", "Pokemon incorrecto");
        softAssert.assertEquals(listaOrdenada[150].getNombre(), "Abra", "Pokemon incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void pokemonesAtrapadosTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var pokemonesNoAtrapados = PokemonListas.pokemonesNoatrapados(listaPokemon);
        softAssert.assertEquals(pokemonesNoAtrapados, 80, "Cantidad incorrecta");
        softAssert.assertAll();

    }
}
