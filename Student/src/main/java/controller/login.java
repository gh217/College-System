package controller;

import dao.Daologin;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.LoginModel;

import java.io.IOException;
import java.sql.SQLException;

public class login {

    @FXML
    private Label status;

    @FXML
    private TextField username;

    @FXML
    private TextField Password;

    private static LoginModel model = new LoginModel();

    static String successfullUserName(){
        return model.getUsername();
    }

    public void login(ActionEvent event ) throws SQLException, IOException, InterruptedException {
        model.setUsername(username.getText());
        model.setPassword(Password.getText());
        if (Daologin.checkLogin(model)){

            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("choose.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 350);
            stage.setTitle("Hello student ");
            stage.setScene(scene);
            stage.show();
            Stage last=(Stage) (username.getScene().getWindow());
            last.close();
            //new Frame2();
        }else{
            status.setText(" error user name / password");
        }
    }

}