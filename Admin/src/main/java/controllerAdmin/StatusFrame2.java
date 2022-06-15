package controllerAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StatusFrame2 {

    @FXML
    private Button logOutButton;

    public void addStudent(ActionEvent action) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("frame_3add.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 630, 550);
        stage.setTitle("Hello employee ");
        stage.setScene(scene);
        stage.show();
        //Frame3.set();
    }

    public void findStudent(ActionEvent action) throws IOException {

        System.out.println("first");
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("samllSearch.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 300);
        stage.setTitle(" To Search ");
        stage.setScene(scene);
        stage.show();

    }

    public void updateStudent(ActionEvent action) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("chooseUpdate.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 451);
        stage.setTitle(" To Update ");
        stage.setScene(scene);
        stage.show();

    }

    public void deleteStudent(ActionEvent action) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("deleteFrame4.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 300);
        stage.setTitle(" To Delete ");
        stage.setScene(scene);
        stage.show();

    }

    public void Object(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("object.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 333, 352);
        stage.setTitle(" Object ");
        stage.setScene(scene);
        stage.show();

    }

    public void logOut(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 350);
        stage.setTitle("Welcome Employee");
        stage.setScene(scene);
        stage.show();

        Stage last=(Stage) (logOutButton.getScene().getWindow());
        last.close();
    }
}
