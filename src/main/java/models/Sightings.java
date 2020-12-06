package models;


import java.security.Timestamp;

public class Sightings{
    private String location;
    private String rangerName;
    private int wildlifeId;
    private int id;

    private Timestamp time;

    public Sightings(String location, String rangerName, int wildlifeId){

        this.location = location;
        this.rangerName = rangerName;
        this.wildlifeId = wildlifeId;
    }
}