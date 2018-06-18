package dao;

import model.Guitar;
import service.GuitarSpec;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuitarDao {

    public List<Guitar> getAllGuitar(){
        ResultSet rs=SqliteUtil.executeQuery("SELECT * FROM inventory;", new Object[]{});
        List<Guitar> guitarList =new ArrayList<Guitar>();
        try{
            while(rs.next()){
                Guitar Guitar =new Guitar();
                Guitar.setId(rs.getInt(1));
                Guitar.setName(rs.getString(2));
                Guitar.setCount(rs.getInt(6));
                GuitarSpec guitarSpec = new GuitarSpec();
                guitarSpec.setColor(rs.getString(3));
                guitarSpec.setNumber(rs.getString(4));
                guitarSpec.setSize(rs.getString(5));
                Guitar.setGuitarSpec(guitarSpec);
                guitarList.add(Guitar);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return guitarList;
    }
}
