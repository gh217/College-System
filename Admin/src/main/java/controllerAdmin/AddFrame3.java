package controllerAdmin;

import Dao.DaoAddLoginStudent;
import Dao.DaoStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.ModelLoginStudent;
import model.ModelStudent;

import java.sql.SQLException;

public class AddFrame3 {

    @FXML
    private TextField userNameField,passwordField,idField,nameField,addressField,yearField,
            departmentField,gpaField;

    @FXML
    private Label errorLogin,checkStudent;

    private ModelLoginStudent modelLogin=new ModelLoginStudent();
    private ModelStudent modelStudent=new ModelStudent();

    public void saveData(ActionEvent action ) throws SQLException {

        modelLogin.setUsername(userNameField.getText());
        modelLogin.setPassword(passwordField.getText());

        if(DaoAddLoginStudent.add(modelLogin)){
            System.out.println(userNameField.getText());
            modelStudent.setUsername(userNameField.getText());
            modelStudent.setName(nameField.getText());
            modelStudent.setId(Integer.parseInt(idField.getText()));
            modelStudent.setAddress(addressField.getText());
            modelStudent.setYear(Integer.parseInt(yearField.getText()));

            // handle depart but it no
           // if(departmentField.getText()!=null) modelStudent.setDepartement(departmentField.getText());

            if(gpaField.getText().equals("null")) gpaField.setText("null");
            else modelStudent.setJpa(Double.parseDouble(gpaField.getText()));

            if(DaoStudent.addL(modelStudent)){
                checkStudent.setText("");
                checkStudent.setText("Insert Done");
                errorLogin.setText("");
            }else{
                checkStudent.setText("Error In Data");
                errorLogin.setText("");
                ///delete from login
                DaoStudent.removeStudent(modelStudent.getUsername());
            }

        }else{
            errorLogin.setText(" Username Exist or Password Null ");
            checkStudent.setText("");
            DaoStudent.removeStudent(modelStudent.getUsername());
            // delete user name from login
        }

    }

    public void clear(ActionEvent event ){
        userNameField.setText(""); passwordField.setText("");idField.setText("");
        nameField.setText(""); addressField.setText(""); yearField.setText("");
        departmentField.setText("no"); gpaField.setText("null");
        errorLogin.setText("");checkStudent.setText("");
    }


}
