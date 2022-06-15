package Dao;

import model.ModelLoginAdmin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoLoginAdmin {

    private static PreparedStatement state;
    private static ResultSet result;

    public static  boolean checkLogin(ModelLoginAdmin model ) throws SQLException {
        String query="select * from loginAdmin where userName=? and passwword=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1, model.getUsername());
        state.setString(2, model.getPassword());
        result=state.executeQuery();
        return result.next();
    }

}
