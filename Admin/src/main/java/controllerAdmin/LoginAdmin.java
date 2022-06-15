package controllerAdmin;

import Dao.DaoLoginAdmin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ModelLoginAdmin;

import java.io.IOException;
import java.sql.SQLException;

public class LoginAdmin {
    @FXML
    private Label error;

    @FXML
    private TextField userName,password;

    private ModelLoginAdmin model = new ModelLoginAdmin();

    public void login(ActionEvent event ) throws SQLException, IOException, InterruptedException {
        model.setUsername(userName.getText());
        model.setPassword(password.getText());
        if (DaoLoginAdmin.checkLogin(model)){
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("frame_2.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 530);
            stage.setTitle("Hello Employee ");
            stage.setScene(scene);
            stage.show();
            Stage last=(Stage) (userName.getScene().getWindow());
            last.close();
        }else{
            error.setText(" Error User Name / Password");
        }
    }
}