package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class UpdatePassword {
    @FXML
    Label message;

    @FXML
    private TextField userNameField,passwordField;

    public void update(ActionEvent e ) throws SQLException {
        String password=passwordField.getText();
        String userName= userNameField.getText();
        DaoStudent.updatePassword(password,userName);
        message.setText("Update Done");
    }

    public void clear(ActionEvent e ) throws SQLException{
        userNameField.clear();
        passwordField.clear();
        message.setText("");
    }
}
