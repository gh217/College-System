package controllerAdmin;

import Dao.DaoAddLoginStudent;
import Dao.DaoObject;
import Dao.DaoStudent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelLoginStudent;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class MainAdmin extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 350);
        stage.setTitle("Welcome Employee");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {

            launch();

        try {
        //DaoObject.addObject(1,"os2");


//            DaoObject.deleteObjectAll(1);
//            System.out.println("done");
            //DaoStudent.updateGpa(3.5,1,"null");
            //DaoStudent.updateAddress("menofia",1);
            //System.out.println("first : "+DaoStudent.removeStudent("mo3@"));
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

    }
}