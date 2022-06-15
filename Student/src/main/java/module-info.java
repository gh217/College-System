module all.projectjava1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens controller to javafx.fxml;
    exports controller;
}