package DAO;

import models.Endangered;
import models.Wildlife;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class EndangeredDAO<Sql2oEndangered> implements sql2oEndangered{
    private final Sql2o sql2o;
    public static final String DATABASE_TYPE = "endangered";
    private final String type;

    public EndangeredDAO(Sql2o sql2o) {
        this.sql2o = sql2o;
        this.type = DATABASE_TYPE;
    }

    @Override
    public List<Endangered> getAllEndangeredAnimals() {
        try(Connection con = sql2o.open()){
            String sql = "SELECT * FROM animals WHERE type='endangered';";
            return con.createQuery(sql)
                    .executeAndFetch(Endangered.class);
        }catch (Sql2oException ex){
            System.out.println(ex);
            return null;
        }
    }

    public Endangered getEndangeredById(int id) {
        String sql = "SELECT * FROM animals WHERE id=:id AND type='endangered'";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Endangered.class);
        }catch (Sql2oException ex){
            System.out.println(ex);
            return null;
        }
    }

    public void addAnimalName(String name) {
        try (Connection con = sql2o.open()) {
            String sql = "INSERT INTO animals(animalName, type) VALUES(:animalName,:type)";
            Wildlife.id = (int) con.createQuery(sql, true)
                    .addParameter("animalName",name)
                    .addParameter("type", this.type)
                    .executeUpdate()
                    .getKey();
        }catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void saveAgeOfAnimal(String age) {
        String sql ="UPDATE animals SET age=:age WHERE type='endangered'" ;
        try (Connection con = sql2o.open()){
            con.createQuery(sql)
                    .addParameter("age", age)
                    .executeUpdate();
        }

    }

    @Override
    public void saveHealthOfAnimal(String health) {
        String sql = "UPDATE animals SET health=:health WHERE type='endangered' ";
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("health", health)
                    .executeUpdate();
        }catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
}