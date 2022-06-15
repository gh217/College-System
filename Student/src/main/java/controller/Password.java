package controller;

import dao.DaoFillStudent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Password {


    String userName;
    @FXML
    Label error,passLabel,passCLabel,done;

    @FXML
    TextField passField,passCField;


    public void save(ActionEvent actionEvent) throws SQLException {
        userName=login.successfullUserName();

        String pass1=passField.getText();
        String pass2=passCField.getText();

        if(pass1.equals(pass2)&&pass1.equals("")){
            error.setText("Error Empty Pass ");
        }else if(pass1.equals(pass2)){
            /// code in dao
            DaoFillStudent.updatePassword(pass1,userName);
            error.setText("");
            done.setText("Change Done");

        }else {
            error.setText("Not Match");
            done.setText("");
        }

    }

    public void showPassword(ActionEvent actionEvent) {
            passLabel.setText(passField.getText());
            passCLabel.setText(passCField.getText());
    }

    public void hidePassword(ActionEvent actionEvent) {
        passLabel.setText("");
        passCLabel.setText("");
    }

    public void clear(ActionEvent actionEvent) {
        error.setText("");
        passLabel.setText("");
        passCLabel.setText("");
        passField.clear();
        passCField.clear();
        done.setText("");
    }
}
