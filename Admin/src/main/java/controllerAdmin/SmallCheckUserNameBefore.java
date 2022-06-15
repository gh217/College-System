package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class SmallCheckUserNameBefore {

    public  static String userName;
    private static int id=0;

    @FXML
     TextField  userNameField;
    @FXML
     Label error;

    public  void check(ActionEvent action ) throws SQLException, IOException {
        userName=userNameField.getText();
        if (DaoStudent.foundOrNot(userName)){
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("frame_4search.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.setTitle("Student Information ");
            stage.setScene(scene);
            stage.show();
        }else{
            error.setText("Not Found");
        }
    }

    public void clear(ActionEvent actionEvent) {
        error.setText("");
        userNameField.clear();
    }
    public static int getID(){
        return id;
    }
}
