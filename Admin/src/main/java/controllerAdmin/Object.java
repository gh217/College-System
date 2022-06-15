package controllerAdmin;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Object {

    public void addObject(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("addObject.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 300);
        stage.setTitle(" To Add ");
        stage.setScene(scene);
        stage.show();
    }

    public  void deleteObject(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("deleteObject.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 300);
        stage.setTitle(" Delete Object");
        stage.setScene(scene);
        stage.show();
    }

    public void updateObjectDegree(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("updateDegree.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 400);
        stage.setTitle(" Update Degree Done");
        stage.setScene(scene);
        stage.show();
    }

    public void deleteObjectAll(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("deleteAllObject.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 250);
        stage.setTitle(" Update Degree Done");
        stage.setScene(scene);
        stage.show();
    }

}
