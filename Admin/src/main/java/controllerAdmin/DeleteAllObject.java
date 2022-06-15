package controllerAdmin;

import Dao.DaoObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class DeleteAllObject {
    @FXML
    Label message;

    @FXML
    private TextField idField;

    public void addObject(ActionEvent e ) throws Exception {
        int id= Integer.parseInt(idField.getText());
        try {
            DaoObject.deleteObjectAll(id);
            message.setText("Delete Done");
        }catch (Exception exception ){
            message.setText(exception.getMessage());
        }
    }

    public void clear(ActionEvent e ) throws SQLException {
        idField.clear();
        message.setText("");
    }
}
