package testmvn.pokemon;

import base.BaseTest;
import clases.PokemonListas;
import data.DataGiver;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import model.Pokemon;
import org.testng.annotations.Test;

public class PokemonTests extends BaseTest {
    @Test(groups = {regression, smoke})
    @Description("Verificando datos del Pokemon 20")
    public void id20Test() {
        final var id = 20;
        final var pokemon = DataGiver.getByID(id);
        softAssert.assertEquals(pokemon.getNombre(), "Staryu", "Nombre incorrecto");
        softAssert.assertEquals(pokemon.getNombreJapones(), "Ratta", "Nombre Japones incorrecto");
        softAssert.assertEquals(pokemon.getAtk(), 97, "Ataque incorrecto");
        softAssert.assertEquals(pokemon.getDef(), 9, "Defensa incorrecto");
        softAssert.assertEquals(pokemon.getSepDef(), 81, "Defensa especial incorrecto");
        softAssert.assertEquals(pokemon.getCrit(), 7, "Critico incorrecto");
        softAssert.assertEquals(pokemon.getPeso(), 7.28, "Peso incorrecto");
        softAssert.assertTrue(pokemon.isAtrapado());
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando el pokemon de mayor ataque")
    @Step("El pokemon debe ser Rhydon")
    public void ordenarAtaqueTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var listaOrdenada = PokemonListas.bubbleSortAtaque(listaPokemon);
        softAssert.assertEquals(listaOrdenada[0].getNombre(), "Rhydon", "Pokemon incorrecto");
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando el orden de pokemons por Nombre")
    @Step("El primer pokemon debe ser Zubat y el ultimo Abra")
    public void ordenarNombresTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var listaOrdenada = PokemonListas.bubbleSortPokemon(listaPokemon);
        softAssert.assertEquals(listaOrdenada[0].getNombre(), "Zubat", "Pokemon incorrecto");
        softAssert.assertEquals(listaOrdenada[150].getNombre(), "Abra", "Pokemon incorrecto");
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando la cantidad de pokemones atrapados")
    @Step("Se deben encontrar 80 pokemons atrapados")
    public void pokemonesAtrapadosTest() {
        final var listaPokemon = PokemonListas.listaPokemon();
        final var pokemonesNoAtrapados = PokemonListas.pokemonesNoatrapados(listaPokemon);
        softAssert.assertEquals(pokemonesNoAtrapados, 80, "Cantidad incorrecta");
        softAssert.assertAll();
    }

    @Test(dataProvider = DataGiver.DP_POKEMONS, dataProviderClass = DataGiver.class, groups = {regression, smoke})
    @Description("Verificando datos de Pokemones")
    public void pokemonTest(Pokemon pokemon) {
        softAssert.assertTrue(pokemon.getNombre().length() > 2 && pokemon.getNombre().length() < 30);
        softAssert.assertTrue(pokemon.getNombreJapones().length() > 2 && pokemon.getNombreJapones().length() < 25);
        softAssert.assertTrue(pokemon.getAtk() > 0);
        softAssert.assertTrue(pokemon.getDef() > 0);
        softAssert.assertTrue(pokemon.getSepDef() > 0);
        softAssert.assertTrue(pokemon.getCrit() > 0);
        softAssert.assertTrue(pokemon.getPeso() > 0);
        //softAssert.assertTrue(pokemon.isAtrapado() instanceof boolean);
        softAssert.assertAll();

    }
}
