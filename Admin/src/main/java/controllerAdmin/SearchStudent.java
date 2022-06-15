package controllerAdmin;

import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.ModelStudent;

import java.sql.SQLException;

public class SearchStudent {

    @FXML
    private Label idLabel,nameLabel,userNameLabel,addressLabel,departmentLabel,gpaLabel,yearLabel,notRegistre;

    private static String userName="";
    private static int id;

    private ModelStudent student;

    public SearchStudent() throws SQLException {
        userName=SmallCheckUserNameBefore.userName;
        student=DaoStudent.Search(userName);

        if(student!=null)id=student.getId();

    }


    public void showdata(ActionEvent event ) throws SQLException {

        if(student==null){
            notRegistre.setText("Not Registre");
            return;
        }
        idLabel.setText(""+student.getId()+"");
        nameLabel.setText(student.getName());
        userNameLabel.setText(student.getUsername());
        addressLabel.setText(student.getAddress());
        yearLabel.setText(student.getYear()+"");
        departmentLabel.setText(student.getDepartement());

        if(((int)student.getJpa())!=0)
            gpaLabel.setText(student.getJpa()+"");
        else
            gpaLabel.setText("no");
    }


    public void showObject(ActionEvent event ) throws SQLException{
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(MainAdmin.class.getResource("frame_5course.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 350);
            stage.setTitle("student Course");
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static int getID() {
        return id;
    }
}
