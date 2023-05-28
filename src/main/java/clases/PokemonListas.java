package clases;

import data.DataGiver;
import model.Pokemon;

public class PokemonListas {
    public static Pokemon[] listaPokemon() {
        final var listaAleatoria = new Pokemon[151];
        for (var i = 1; i < 152; i++) {
            var dataGiver = DataGiver.getByID(i);
            listaAleatoria[i - 1] = dataGiver;
        }
        return listaAleatoria;
    }

    public static Pokemon[] bubbleSortPokemon(Pokemon[] listaPokemon) {

        for (var i = 0; i < 150; i++) {
            var swapped = false;

            for (var j = 0; j < 151 - i - 1; j++) {
                if (listaPokemon[j].getNombre().compareTo(listaPokemon[j + 1].getNombre()) < 0) {
                    // Intercambiar las pokemones
                    var temp = listaPokemon[j];
                    listaPokemon[j] = listaPokemon[j + 1];
                    listaPokemon[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        return listaPokemon;

    }

    public static Pokemon[] bubbleSortAtaque(Pokemon[] listaPokemon) {

        for (var i = 0; i < 150; i++) {
            var swapped = false;

            for (var j = 0; j < 151 - i - 1; j++) {
                if (listaPokemon[j].getAtk() < listaPokemon[j + 1].getAtk()) {
                    Pokemon temp = listaPokemon[j];
                    listaPokemon[j] = listaPokemon[j + 1];
                    listaPokemon[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        return listaPokemon;
    }

    public static int pokemonesNoatrapados(Pokemon[] listaPokemon) {
        var pokemonesNoatrapados = 0;
        for (var i = 0; i < 151; i++) {
            if (listaPokemon[i].isAtrapado() == false) {
                pokemonesNoatrapados++;
            }

        }
        return pokemonesNoatrapados;
    }
}
