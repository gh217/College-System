package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Choose {

    @FXML
    Button logOutButton;

    public void studnetInfo(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("frame_2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Hello student ");
        stage.setScene(scene);
        stage.show();
    }

    public void changePassword(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("password_5.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 530, 420);
        stage.setTitle("Change Password ");
        stage.setScene(scene);
        stage.show();
    }

    public void logOut(ActionEvent actionEvent) throws IOException {
        Stage last=(Stage) (logOutButton.getScene().getWindow());
        last.close();

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 370, 420);
        stage.setTitle("Hello student ");
        stage.setScene(scene);
        stage.show();


    }

}
