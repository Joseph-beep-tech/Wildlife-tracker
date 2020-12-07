package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredTest {

    @Test
    public void animalInstantiatesCorrectly(){
        Endangered firstAnimal = new Endangered("hippo","ill","young");// health should be a constant
        assertEquals(true, firstAnimal instanceof Endangered);
    }

}