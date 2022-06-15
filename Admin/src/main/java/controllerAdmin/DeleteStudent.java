package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class DeleteStudent {

    @FXML
    private TextField userNameField;

    @FXML
    private Label statusDelete,succeed;

    public void Delete(ActionEvent event) throws SQLException {
        if(DaoStudent.removeStudent(userNameField.getText())){
            succeed.setText("Delete Done ");
            statusDelete.setText("");
        }else{
            statusDelete.setText("Not Found ");
            succeed.setText("");
        }
    }

    public void clear(ActionEvent event) throws SQLException {
        statusDelete.setText("");
        userNameField.setText("");
        succeed.setText("");
    }
}
