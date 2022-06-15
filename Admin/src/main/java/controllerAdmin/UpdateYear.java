package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class UpdateYear {

    @FXML
    Label message;

    @FXML
    private TextField idField,yearField;

    public void update(ActionEvent event) throws SQLException {
        int year= Integer.parseInt(yearField.getText());
        int id= Integer.parseInt(idField.getText());
        DaoStudent.updateYear(year,id);
        message.setText("Update Done");
    }

    public void clear(ActionEvent event) {
        idField.clear();
        yearField.clear();
        message.setText("");
    }
}
