package dao;


import javafx.util.Pair;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class DaoObject {

    static PreparedStatement state;
    static ResultSet result;
    public static String getObject(int id ) throws SQLException {

        String query="select * from student_object where id_student=? ";
        state=DbConnect.connect().prepareStatement(query);
        state.setInt(1,id);

        Vector<Pair<String,Integer>> vec = new Vector<>();

        result=state.executeQuery();

        while (result.next()){
            String object=result.getString("id_object");
            int degree = result.getInt("degree");
            vec.add(new Pair<>(object,degree));
        }

        String res="";
        for (Pair<String,Integer> i : vec ){
            query="select * from object where id=? ";
            state=DbConnect.connect().prepareStatement(query);
            state.setString(1,  i.getKey());
            result=state.executeQuery();
            result.next();
            String sid=result.getString("id");
            int hours= result.getInt("hours");
            float price= result.getFloat("price");
            String sprevious=result.getString("previous");


            res+=sid+"        \t\t"+hours+"            \t\t"+price+"     \t\t"+i.getValue()+"\n";
        }
        return res;
    }


}
