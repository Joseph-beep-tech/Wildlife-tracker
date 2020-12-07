package models;

import java.util.List;

import org.sql2o.Connection;
import org.sql2o.Sql2oException;

public class Animal extends Wildlife{
    private int id;
    public static final String DATABASE_TYPE = "animal";

    public Animal(String animalName, String type){
        super(animalName, type);
        this.setType (DATABASE_TYPE);
    }

}