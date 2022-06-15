package Dao;


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

    /////*******

    public static void addObject( int id , String object ) throws Exception {

        if (countObject(id)==6)throw new Exception("Register 6 Object");

        // if not null

        if(NULL(object)==null){
            String query="insert into student_object (id_student,id_object) values(?,?)";
            state=DbConnect.connect().prepareStatement(query);
            state.setInt(1,id);
            state.setString(2,object);

            //System.out.println("after");
            try {
                state.execute();
                throw new Exception("DONE");
                // System.out.println("yes");
            }catch (Exception e){
                throw new Exception(e.getMessage());
            }


        }else{/// not empty

            String aa=NULL(object);
            if(succeed(id,aa)){

                String query="insert into student_object (id_student,id_object) values(?,?)";
                state=DbConnect.connect().prepareStatement(query);
                state.setInt(1,id);
                state.setString(2,object);

                //System.out.println("after");
                try {
                    state.execute();
                    throw new Exception("DONE");
                    // System.out.println("yes");
                }catch (Exception e){
                    throw new Exception(e.getMessage());
                }

            }else{
                throw  new Exception("not Suucced in "+aa);
            }


        }
        /// if uull


    }

    private static String NULL(String object) throws SQLException {
        String Query="select * from object where id=?";
        PreparedStatement state=DbConnect.connect().prepareStatement(Query);
        state.setString(1,object);
        ResultSet result= state.executeQuery();

        if(result.next()){
            String s=result.getString("previous");
            System.out.println(s);
            return s;
        }
        return null;
    }

    private static boolean succeed(int id , String pre) throws SQLException {
        String Query="select * from student_succeed where id_studnt=? and id_object=?";
        PreparedStatement state=DbConnect.connect().prepareStatement(Query);
        state.setString(1,id+"");
        state.setString(2,pre);
        ResultSet result= state.executeQuery();

        return result.next();
    }
    private static int countObject(int id) throws SQLException {
        String query="select * from student_object where id_student=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setInt(1,id);

        ResultSet result=state.executeQuery();
        int count=0;

        while (result.next()){
            count++;
        }
        // System.out.println(count);
        return count;
    }

    public static void deleteObject( int id , String object ) throws Exception {

        String query="delete from student_object where id_student=? and id_object=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setInt(1,id);
        state.setString(2,object);
        state.execute();
    }

    public static void updateObjectDegree( int id , String object , int degree ) throws Exception {

        String query="update student_object set degree =? where id_student=? and id_object=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setInt(1,degree);
        state.setInt(2,id);
        state.setString(3,object);
        state.execute();
    }

    public static void deleteObjectAll( int id  ) throws Exception {

        String query="delete from student_object where id_student=?";
        state=DbConnect.connect().prepareStatement(query);
        state.setInt(1,id);
        state.execute();
        return;
    }


}
