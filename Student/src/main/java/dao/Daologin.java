package dao;

import model.LoginModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Daologin {

    private static PreparedStatement state;
    private static ResultSet result;

    public static  boolean checkLogin(LoginModel model ) throws SQLException {
        String query="select * from login where userName=? and passwword=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1, model.getUsername());
        state.setString(2, model.getPassword());
        result=state.executeQuery();
        if(!result.next()) return false;
        else return true;

    }

}
