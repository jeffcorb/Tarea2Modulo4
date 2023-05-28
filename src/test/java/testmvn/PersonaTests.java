package testmvn;

import base.BaseTest;
import data.JsonReader;
import org.testng.annotations.Test;

public class PersonaTests extends BaseTest {
    @Test
    public void FavoriteMealsTest() {
        final var persona = JsonReader.getPersona();
        final var tamanoFavoriteMeals = persona.getFavoriteMeals().size();
        softAssert.assertEquals(tamanoFavoriteMeals, 4, "valor incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void VerificarListaAmigosTest() {
        final var persona = JsonReader.getPersona();
        final var tamanoListaAmigos = persona.getAmigos().size();
        softAssert.assertEquals(tamanoListaAmigos, 3, "valor incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void VerificarAmigo1Test() {
        final var persona = JsonReader.getPersona();
        final var listaAmigos = persona.getAmigos();

        final var nombre = listaAmigos.get(1).getName();
        final var profesion = listaAmigos.get(1).getProfesion();
        final var whereMeet = listaAmigos.get(1).getWhereMeet();
        softAssert.assertEquals(nombre, "Carlos", "Nombre incorrecto");
        softAssert.assertEquals(profesion, "Profesor", "Profesion incorrecto");
        softAssert.assertEquals(whereMeet, "Universidad", "valor incorrecto");
        softAssert.assertAll();
    }

    @Test
    public void VerificarTrabajoLeadTest() {
        final var persona = JsonReader.getPersona();
        final var mapTrabajo = persona.getTrabajos();

        final var description = mapTrabajo.get("lead").getDescription();
        final var hoursDay = mapTrabajo.get("lead").getHoursPerDay();
        final var active = mapTrabajo.get("lead").isActive();
        softAssert.assertEquals(description, "trabajo como junior luego de practicante", "Descripcion incorrecta");
        softAssert.assertEquals(hoursDay, 8, "Horas incorrectas");
        softAssert.assertTrue(active);
        softAssert.assertAll();

    }

    @Test
    public void VerificarPaisTest() {
        final var persona = JsonReader.getPersona();
        final var pais = persona.getCountry();

        softAssert.assertEquals(pais, "Checoslovaquia", "Pais incorrecto");
        softAssert.assertAll();
    }
}
