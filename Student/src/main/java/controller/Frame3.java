package controller;

import dao.DaoObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.sql.SQLException;

public class Frame3 {

    @FXML
    private Label displayObject,error;
    private int id;
    public String userName="";


    public void display(ActionEvent event ) throws SQLException {

        id=Frame2.getID();
        // to get id to continue search
        String res= DaoObject.getObject(id);

        if(res.equals(""))error.setText("No course Register");
        else{
            displayObject.setText(res);
        }
    }


    public void save(ActionEvent event){
        System.out.println("mo");
    }
}
