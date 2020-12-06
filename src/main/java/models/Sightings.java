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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRangerName() {
        return rangerName;
    }

    public void setRangerName(String rangerName) {
        this.rangerName = rangerName;
    }

    public int getWildlifeId() {
        return wildlifeId;
    }

    public void setWildlifeId(int wildlifeId) {
        this.wildlifeId = wildlifeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }
}