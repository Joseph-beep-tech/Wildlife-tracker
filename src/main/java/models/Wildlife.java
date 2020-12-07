package models;

public abstract class Wildlife{
    public static int id;
    private String animalName;
    private String type;

    public Wildlife(String animalName, String type, String young){
        this.animalName = animalName;
        this.type = type;
    }

    public static int getId() {

        return id;
    }

    public static void setId(int id) {
        Wildlife.id = id;
    }

    public String getAnimalName() {

        return animalName;
    }

    public void setAnimalName(String animalName) {

        this.animalName = animalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        this.type = type;
    }
}