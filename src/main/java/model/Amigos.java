package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amigos {
    @JsonProperty("name")
    private String name;
    @JsonProperty("profession")
    private String profesion;
    @JsonProperty("where_they_meet")
    private String whereMeet;

    public String getName() {
        return name;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getWhereMeet() {
        return whereMeet;
    }
}
