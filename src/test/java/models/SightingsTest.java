package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class SightingsTest {
    @Test
    public void locationInstantiatesCorrectly() {
        Sightings newViewed = new Sightings("North","Okoth", 1);
        assertEquals(true, newViewed instanceof Sightings);
    }
}