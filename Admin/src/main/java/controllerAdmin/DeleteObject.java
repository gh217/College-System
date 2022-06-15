package controllerAdmin;

import Dao.DaoObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class DeleteObject {
    @FXML
    Label message;

    @FXML
    private TextField idField,objectField;

    public void addObject(ActionEvent e ) throws Exception {
        String Object=objectField.getText();
        int id= Integer.parseInt(idField.getText());
        try {
            DaoObject.deleteObject(id,Object);
            message.setText("Delete Done");
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
