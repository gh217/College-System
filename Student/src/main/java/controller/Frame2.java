package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.StudentModel;

import java.io.IOException;
import java.sql.SQLException;


public class Frame2 {

    @FXML
    private Label idLabel,nameLabel,userNameLabel,addressLabel,departmentLabel,gpaLabel,yearLabel,notRegistre;

    private static String userName="";
    private StudentModel student;
    private static int id;
    private static int username;

    // call when i display frmae
    public Frame2() throws SQLException {
        userName=login.successfullUserName();
        student=dao.DaoFillStudent.fill(userName);
        if(student!=null) {
            id=student.getId();
            userName=student.getUsername();
        }
       // System.out.println("mo");
    }

    public void showdata(ActionEvent event ) throws SQLException {

        if(student==null){
            notRegistre.setText("not Registre");
            return;
        }
        idLabel.setText(""+student.getId()+"");
        nameLabel.setText(student.getName());
        userNameLabel.setText(student.getUsername());
        addressLabel.setText(student.getAddress());
        yearLabel.setText(student.getYear()+"");
        departmentLabel.setText(student.getDepartement());

        if(((int)student.getJpa())!=0)
            gpaLabel.setText(student.getJpa()+"");
        else
            gpaLabel.setText("no");

    }

    public void showObject(ActionEvent event ) throws IOException {

       try {
           Stage stage = new Stage();
           FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("frame_3.fxml"));
           Scene scene = new Scene(fxmlLoader.load(), 600, 350);
           stage.setTitle("Hello student ");
           stage.setScene(scene);
           stage.show();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

    public static int getID(){
        return id;
    }
    //public static String getUsername(){return userName;}
}
