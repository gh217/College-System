package controllerAdmin;

import Dao.DaoObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class UpdateDegree {
    @FXML
    Label message;

    @FXML
    private TextField idField,objectField,degreeField;

    public void updateDegree(ActionEvent e ) throws Exception {
        String Object=objectField.getText();
        int id= Integer.parseInt(idField.getText());
        int degree = Integer.parseInt(degreeField.getText());
        try {
            DaoObject.updateObjectDegree(id,Object,degree);
            message.setText("Update Done");
        }catch (Exception exception ){
            message.setText(exception.getMessage());
        }
    }

    public void clear(ActionEvent e ) throws SQLException {
        idField.clear();
        objectField.clear();
        message.setText("");
    }
}
