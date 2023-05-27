package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
    private List<String> amigos;

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

    public List<String> getAmigos() {
        return amigos;
    }
}
