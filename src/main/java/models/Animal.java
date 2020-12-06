package models;

public class Animal extends Wildlife{
    private int id;
    public static final String DATABASE_TYPE = "animal";

    public Animal(String animalName, String type){
        super(animalName, type);
        this.setType (DATABASE_TYPE);
    }

}