
package DAO;

import models.Endangered;
import models.Wildlife;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class WildlifeDAO implements sql2oWildlife {

    private final Sql2o sql2o;

    public WildlifeDAO(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void addAnimalName(Wildlife wildlife) {
        try (Connection con = sql2o.open()) {
            String sql = "INSERT INTO animals(animalName, type) VALUES(:animalName,:type)";
            Wildlife.id = (int) con.createQuery(sql, true)
                    .bind(wildlife)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();

        }
    }



    @Override
    public List<Wildlife> getAllWildlife(){
        String sql = "SELECT * FROM animals";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Wildlife.class);
        }catch (Sql2oException ex){
            System.out.println(ex);
            return null;
        }
    }
    public List<Endangered> getDangerAnimal() {
        try (Connection con = sql2o.open()) {
            String sql = "SELECT * FROM animals WHERE type='endangered'";
            try (Connection conn = sql2o.open()) {
                return (List<Endangered>) con.createQuery(sql)
                        .executeAndFetch(Endangered.class);
            } catch (Sql2oException ex) {
                System.out.println(ex);
                return null;
            }
        }
    }

}