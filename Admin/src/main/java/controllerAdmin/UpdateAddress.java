package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class UpdateAddress {
    @FXML
    Label message;

    @FXML
    private TextField idField,addressField;

    public void update(ActionEvent e ) throws SQLException {
        String address=addressField.getText();
        int id= Integer.parseInt(idField.getText());
        DaoStudent.updateAddress(address,id);
        message.setText("Update Done");
    }

    public void clear(ActionEvent e ) throws SQLException{
        idField.clear();
        addressField.clear();
        message.setText("");
    }
}
