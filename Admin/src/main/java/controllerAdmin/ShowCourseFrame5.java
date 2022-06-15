package controllerAdmin;

import Dao.DaoObject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.SQLException;

public class ShowCourseFrame5 {

    private int id;

    @FXML
    private Label displayObject,error;

    public void display(ActionEvent actionEvent) throws SQLException {

        id=SearchStudent.getID();
        String res= DaoObject.getObject(id);

        if(res.equals(""))error.setText("No course Register");
        else{
            displayObject.setText(res);
        }

    }
}
