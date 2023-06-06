package testmvn.personas;

import base.BaseTest;
import data.JsonReader;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class PersonaTests extends BaseTest {
    @Test(groups = {regression, smoke})
    @Description("Verificando la comida favorita ")
    @Step("verificamos que el valor de la lista sea de 4 items")
    public void favoriteMealsTest() {
        final var persona = JsonReader.getPersona();
        final var tamanoFavoriteMeals = persona.getFavoriteMeals().size();
        softAssert.assertEquals(tamanoFavoriteMeals, 4, "valor incorrecto");
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    @Description("verificando amigos")
    @Step("verificamos que el valor de la lista sea de 3 items")
    public void verificarListaAmigosTest() {
        final var persona = JsonReader.getPersona();
        softAssert.assertEquals(persona.getAmigos().size(), 3, "valor incorrecto");
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando datos del amigo 1")
    @Step("Verificamos que los campos Nombre, profesion y donde se conocieron sean correctos")
    public void verificarAmigo1Test() {
        final var persona = JsonReader.getPersona();
        final var listaAmigos = persona.getAmigos();

        final var amigo = listaAmigos.get(0);
        softAssert.assertEquals(amigo.getName(), "Carlos", "Nombre incorrecto");
        softAssert.assertEquals(amigo.getProfesion(), "Profesor", "Profesion incorrecto");
        softAssert.assertEquals(amigo.getWhereMeet(), "Universidad", "valor incorrecto");
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando datos del Lead")
    @Step("Revisamos que el Map contenga valores correctos de trabajo, descripcio, horas diarias y si es activo")
    public void verificarTrabajoLeadTest() {
        final var persona = JsonReader.getPersona();
        final var mapTrabajo = persona.getTrabajos();

        final var lead = mapTrabajo.get("lead");
        softAssert.assertEquals(lead.getDescription(), "trabajo como lead luego de junior", "Descripcion incorrecta");
        softAssert.assertEquals(lead.getHoursPerDay(), 12, "Horas incorrectas");
        softAssert.assertTrue(lead.isActive());
        softAssert.assertAll();
    }

    @Test(groups = {regression, smoke})
    @Description("Verificando Pais de la persona")
    @Step("Verificamos el pais sea  Cheslovaquia")
    public void verificarPaisTest() {
        final var persona = JsonReader.getPersona();
        final var pais = persona.getCountry();

        softAssert.assertEquals(pais, "Checoslovaquia", "Pais incorrecto");
        softAssert.assertAll();
    }
}
