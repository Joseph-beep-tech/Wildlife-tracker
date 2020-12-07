
package DAO;

import models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class SightingsDAO implements Sql2oSightings {

    private final Sql2o sql2o;

    public SightingsDAO(Sql2o sql2o) {
        this.sql2o = sql2o;
    }


    @Override
    public List<Sightings> getAllSightings() {
        String sql = "SELECT * FROM sightings";
        try (Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .executeAndFetch(Sightings.class);
        }catch (Sql2oException ex){
            System.out.println(ex);
            return null;
        }
    }

    @Override
    public void addSightings(Sightings sightings) {
        String sql = "INSERT INTO sightings(location, rangerName, wildlifeId, time) VALUES (:location, :rangerName, :wildlifeId, now())";
        try(Connection conn = sql2o.open()){
            int id = (int) conn.createQuery(sql, true)
                    .bind(sightings)
                    .throwOnMappingFailure(false)
                    .executeUpdate()
                    .getKey();
            sightings.getId();
        }catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
}