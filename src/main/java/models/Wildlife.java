package models;

import java.util.Objects;

public abstract class Wildlife{

    public static int id;
    private String animalName;
    private String type;

    public Wildlife(String animalName, String type){
        this.animalName = animalName;
        this.type = type;
    }
}