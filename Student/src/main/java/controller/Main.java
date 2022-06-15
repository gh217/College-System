package controller;

import dao.DaoFillStudent;
import dao.DaoObject;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.LoginModel;
import model.StudentModel;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 370, 420);
        stage.setTitle("Hello student ");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws SQLException {

         launch();


    }
}