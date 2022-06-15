package controllerAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateStudent {
    public void updateAddress(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("updateAddress.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 300);
        stage.setTitle("Update Address");
        stage.setScene(scene);
        stage.show();
    }

    public void updateYear(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("updateYear.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 300);
        stage.setTitle("Update Depart");
        stage.setScene(scene);
        stage.show();
    }

    public void updateDepart(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("updateDepart.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 300);
        stage.setTitle("Update Depart");
        stage.setScene(scene);
        stage.show();
    }

    public void updatePassword(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("updatePassword.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 300);
        stage.setTitle("Update password");
        stage.setScene(scene);
        stage.show();
    }

    public void updateGpa(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("updateGpa.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 300);
        stage.setTitle("Update GPA");
        stage.setScene(scene);
        stage.show();
    }
}
