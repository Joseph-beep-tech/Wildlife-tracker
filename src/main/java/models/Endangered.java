package  models;

public class Endangered extends Wildlife{

    private String health;
    private  String age;

    public static final String HEALTHY = "health";
    public static final String OKAY = "okay";
    public static final String ILL = "ill";
    public static final String NEWBORN = "newborn";
    public static final String YOUNG = "young";
    public static final String ADULT = "adult";

    private static final String DATABASE_TYPE = "endangered";

    public Endangered(String animalName, String type, String health, String age){

        super(animalName, type);
        this.age = age;
        this.health = health;
        this.setType (DATABASE_TYPE);

    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static String getDatabaseType() {
        return DATABASE_TYPE;
    }
}