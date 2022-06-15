package Dao;

import javafx.event.ActionEvent;
import model.ModelStudent;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoStudent {

    private static PreparedStatement state;

    public static boolean addL(ModelStudent model ) throws SQLException {
        Double d ;
        if((int)(model.getJpa())==-1)d=null;
        else d= model.getJpa();
        String quert;

        System.out.println(model.getJpa());

        System.out.println(model.getDepartement());
        if(d!=null)quert= "insert into student (id,userName,name,address,year,departement,gpa) values(?,?, ?,?,?,?,?)";
        else quert= "insert into student (id,userName,name,address,year,departement) values(?,?, ?,?,?,?)";

        state= DbConnect.connect().prepareStatement(quert);

        state.setInt(1,model.getId());
        state.setString(2, model.getUsername());
        state.setString(3, model.getName());
        state.setString(4,model.getAddress());
        state.setInt(5,model.getYear());
        state.setString(6,model.getDepartement());

        if(d!=null) state.setDouble(7,model.getJpa());


        try {
            state.execute();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    public static boolean removeStudent(String userName) throws SQLException {

        if(!foundOrNot(userName))return false;

        String query="delete from login where username=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1,userName);
        state.execute();
        return true;
    }

    public static  boolean foundOrNot(String userName) throws SQLException {
        String query="select * from login where username=?";
        ResultSet resultSet;
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1,userName);
        resultSet=state.executeQuery();

        return resultSet.next();
    }

    public  static ModelStudent Search(String userName) throws SQLException {

        if (!foundOrNot(userName))return null;

        return fill(userName);

    }

    private static ModelStudent fill(String userName) throws SQLException {
        ModelStudent model = new ModelStudent();
        PreparedStatement state;
        ResultSet result;
        String query="select * from student where userName=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1, userName);
        result=state.executeQuery();

        if (!result.next())return null;

        model.setId(result.getInt("id"));
        model.setUsername(result.getString("userName"));
        model.setName(result.getString("name"));
        model.setAddress(result.getString("address"));
        model.setYear(result.getInt("year"));
        model.setDepartement(result.getString("departement"));
        model.setJpa(result.getDouble("gpa"));
        return model;
    }

    public static void updateAddress( String address,int id) throws SQLException {
        String query="update  student set address=? where id=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1,address);
        state.setInt(2,id);
        state.execute();
    }

    public static void updateYear( int year,int id) throws SQLException {
        String query="update  student set year=? where id=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setInt(1,year);
        state.setInt(2,id);
        state.execute();
    }


    public static boolean updateDepart( String depart,int id) throws SQLException {
        String query="update  student set departement=? where id=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1,depart);
        state.setInt(2,id);

        try {
            state.execute();
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public static boolean updateGpa( double gpa,int id,String s) throws SQLException {
        String query="update  student set gpa=? where id=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setDouble(1,gpa);
        state.setInt(2,id);
        try {
            state.execute();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static boolean updateGpaNull(int id) throws SQLException {
        String query="update  student set gpa=null where id=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setInt(1,id);
        state.execute();
        return false;
    }

    public static void updatePassword( String password , String userName) throws SQLException {
        String query="update  login set passwword=? where userName=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setString(1,password);
        state.setString(2,userName);
        state.execute();
    }

}
