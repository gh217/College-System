package controllerAdmin;

import Dao.DaoObject;
import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AddObject {

    @FXML
    Label message,add;

    @FXML
    private TextField idField,objectField;

    public void addObject(ActionEvent e ) throws Exception {
        String Object=objectField.getText();
        int id= Integer.parseInt(idField.getText());
        try {
            DaoObject.addObject(id,Object);
            message.setText("");
            add.setText("Add Done");
        }catch (Exception exception ){
            message.setText(exception.getMessage());
        }
    }

    public void clear(ActionEvent e ) throws SQLException{
        idField.clear();
        objectField.clear();
        add.setText("");
        message.setText("");
    }
}
