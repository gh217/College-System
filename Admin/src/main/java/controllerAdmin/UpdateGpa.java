package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class UpdateGpa {

    @FXML
    Label message;

    @FXML
    private TextField idField,gpaField;

    public void update(ActionEvent e ) throws SQLException {

        int id= Integer.parseInt(idField.getText());
        if(gpaField.getText().equals("null")){
            DaoStudent.updateGpaNull(id);
            message.setText("Update Done");
            return;
        }
        double gpa= Double.parseDouble(gpaField.getText());

        if(DaoStudent.updateGpa(gpa,id,gpaField.getText())) message.setText("Update Done");
        else message.setText("GPA More Than 4");
    }

    public void clear(ActionEvent e ) throws SQLException{
        idField.clear();
        gpaField.setText("null");
        message.setText("");
    }

}
