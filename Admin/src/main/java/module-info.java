module com.example.admin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens controllerAdmin to javafx.fxml;
    exports controllerAdmin;
}