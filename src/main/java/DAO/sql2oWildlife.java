package DAO;

import models.Wildlife;

import java.util.List;

public interface sql2oWildlife {

    void addAnimalName(Wildlife wildlife);

    List<Wildlife> getAllWildlife();


}