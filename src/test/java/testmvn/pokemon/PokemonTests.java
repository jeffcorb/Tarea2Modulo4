package testmvn.pokemon;

import base.BaseTest;
import clases.PokemonListas;
import data.DataGiver;
import org.testng.annotations.Test;

public class PokemonTests extends BaseTest {
    @Test
    public void ID20Test() {
        final var ID = 20;
        final var dataGiver = DataGiver.getByID(ID);
        softAssert.assertEquals(dataGiver.getNombre(), "Raticate", "Nombre incorrecto");
        softAssert.assertEquals(dataGiver.getNombreJapones(), "Ratta", "Nombre Japones incorrecto");
        softAssert.assertEquals(dataGiver.getAtk(), 97, "Ataque incorrecto");
        softAssert.assertEquals(dataGiver.getDef(), 9, "Defensa incorrecto");
        softAssert.assertEquals(dataGiver.getSepDef(), 4, "Defensa especial incorrecto");
        softAssert.assertEquals(dataGiver.getCrit(), 81, "Critico incorrecto");
        softAssert.assertEquals(dataGiver.getPeso(), 7.28, "Peso incorrecto");
        softAssert.assertTrue(dataGiver.isAtrapado());
        softAssert.assertAll();
    }

    @Test
    public void OrdenarAtaqueTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var listaOrdenada = PokemonListas.bubbleSortAtaque(listaPokemon);
        softAssert.assertEquals(listaOrdenada[0].getNombre(), "Clefairy", "Pokemon incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void OrdenarNombresTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var listaOrdenada = PokemonListas.bubbleSortPokemon(listaPokemon);
        softAssert.assertEquals(listaOrdenada[0].getNombre(), "Zubat", "Pokemon incorrecto");
        softAssert.assertEquals(listaOrdenada[150].getNombre(), "Abra", "Pokemon incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void PokemonesAtrapadosTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var pokemonesNoAtrapados = PokemonListas.pokemonesNoatrapados(listaPokemon);
        softAssert.assertEquals(pokemonesNoAtrapados, 80, "Cantidad incorrecta");
        softAssert.assertAll();

    }
}
