package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class UpdateDepart {
    @FXML
    Label message;

    @FXML
    private TextField idField,departField;

    public void update(ActionEvent e ) throws SQLException {

        String depart=departField.getText();
        int id= Integer.parseInt(idField.getText());
        if(DaoStudent.updateDepart(depart,id))
            message.setText("Update Done");
        else
            message.setText("Depart Not Found");

    }

    public void clear(ActionEvent e ) throws SQLException{
        idField.clear();
        departField.clear();
        message.setText("");
    }
}
