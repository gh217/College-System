package Dao;

import model.ModelLoginStudent;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DaoAddLoginStudent {

    private static PreparedStatement state;

    public static boolean add(ModelLoginStudent model ) throws SQLException {

        String quert="insert into login (userName,passwword) values(?,?)";
        state= DbConnect.connect().prepareStatement(quert);
        state.setString(1, model.getUsername());
        state.setString(2, model.getPassword());

        try {
            state.execute();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }
}
