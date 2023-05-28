package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Persona {
    @JsonProperty("name")
    private String name;

    @JsonProperty("lastname")
    private String lastName;

    @JsonProperty("weight")
    private double weight;

    @JsonProperty("numCertificates")
    private int numCertificates;

    @JsonProperty("country")
    private String country;

    @JsonProperty("married")
    private boolean married;

    @JsonProperty("favoriteMeals")
    private List<String> favoriteMeals;

    @JsonProperty("amigos")
    private List<Amigos> listaAmigos;

    @JsonProperty("trabajos")
    private Map<String, Trabajo> trabajos;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumCertificates() {
        return numCertificates;
    }

    public String getCountry() {
        return country;
    }

    public boolean isMarried() {
        return married;
    }

    public List<String> getFavoriteMeals() {
        return favoriteMeals;
    }

    public List<Amigos> getAmigos() {
        return listaAmigos;
    }

    public Map<String, Trabajo> getTrabajos() {
        return trabajos;
    }
}
