package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.StudentModel;

public class DaoFillStudent {

    public static StudentModel fill(String userName) throws SQLException {
        StudentModel model = new StudentModel();
        PreparedStatement state;
        ResultSet result;
        String query="select * from student where userName=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1, userName);
        result=state.executeQuery();

        if (!result.next())return null;
        //System.out.println(result.getString(2));
        // System.out.println(result.getString("userName"));

        model.setId(result.getInt("id"));
        model.setUsername(result.getString("userName"));
        model.setName(result.getString("name"));
        model.setAddress(result.getString("address"));
        model.setYear(result.getInt("year"));
        model.setDepartement(result.getString("departement"));
        model.setJpa(result.getDouble("gpa"));
        return model;
    }

    public static void updatePassword( String password , String userName) throws SQLException {
        PreparedStatement state;
        String query="update  login set passwword=? where userName=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1,password);
        state.setString(2,userName);
        state.execute();
    }

}
