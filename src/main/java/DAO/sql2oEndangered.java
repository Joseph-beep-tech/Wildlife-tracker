package DAO;

import models.Endangered;

import java.util.List;

public interface sql2oEndangered {
    List<Endangered> getAllEndangeredAnimals();

    void saveAgeOfAnimal(String age);

    void saveHealthOfAnimal(String health);

}
