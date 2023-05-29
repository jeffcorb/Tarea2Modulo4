package testmvn.personas;

import base.BaseTest;
import data.JsonReader;
import org.testng.annotations.Test;

public class PersonaTests extends BaseTest {
    @Test
    public void favoriteMealsTest() {
        final var persona = JsonReader.getPersona();
        final var tamanoFavoriteMeals = persona.getFavoriteMeals().size();
        softAssert.assertEquals(tamanoFavoriteMeals, 4, "valor incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void verificarListaAmigosTest() {
        final var persona = JsonReader.getPersona();
        final var tamanoListaAmigos = persona.getAmigos().size();
        softAssert.assertEquals(tamanoListaAmigos, 3, "valor incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void verificarAmigo1Test() {
        final var persona = JsonReader.getPersona();
        final var listaAmigos = persona.getAmigos();

        final var amigo = listaAmigos.get(1);
        softAssert.assertEquals(amigo.getName(), "Carlos", "Nombre incorrecto");
        softAssert.assertEquals(amigo.getProfesion(), "Profesor", "Profesion incorrecto");
        softAssert.assertEquals(amigo.getWhereMeet(), "Universidad", "valor incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void verificarTrabajoLeadTest() {
        final var persona = JsonReader.getPersona();
        final var mapTrabajo = persona.getTrabajos();

        final var lead = mapTrabajo.get("lead");
        softAssert.assertEquals(lead.getDescription(), "trabajo como junior luego de practicante", "Descripcion incorrecta");
        softAssert.assertEquals(lead.getHoursPerDay(), 8, "Horas incorrectas");
        softAssert.assertTrue(lead.isActive());
        softAssert.assertAll();
    }

    @Test
    public void verificarPaisTest() {
        final var persona = JsonReader.getPersona();
        final var pais = persona.getCountry();

        softAssert.assertEquals(pais, "Checoslovaquia", "Pais incorrecto");
        softAssert.assertAll();
    }
}
