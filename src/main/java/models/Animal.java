package models;

public class Animal extends Wildlife{
    private static final String young = "";
    private static final String type = "";
    private int id;
    public static final String DATABASE_TYPE = "animal";

    public Animal(String animalName){
        super(animalName, type, young );
        this.setType (DATABASE_TYPE);
    }

}